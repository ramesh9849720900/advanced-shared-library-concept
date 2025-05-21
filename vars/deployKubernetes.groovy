def call(Map config) {
    echo "Deploying to Kubernetes: ${config.clusterName}"

    // Load the manifest from shared library resources
    def yamlContent = libraryResource(config.manifest)

    // Extract just the file name, like "teamA-deployment.yaml"
    def fileName = config.manifest.tokenize('/').last()

    // Write it to the workspace
    writeFile file: fileName, text: yamlContent

    // Use kubectl to deploy
    sh "kubectl config use-context ${config.context}"
    sh "kubectl apply -f ${fileName}"
}
