def call(Map config) {
    echo "Deploying to Kubernetes: ${config.clusterName}"

    // Extract the YAML file from the shared library
    def yamlContent = libraryResource(config.manifest)
    def manifestFile = config.manifest.tokenize('/')[-1] // Extract filename only
    writeFile file: manifestFile, text: yamlContent

    sh "kubectl config use-context ${config.context}"
    sh "kubectl apply -f ${manifestFile}"
}
