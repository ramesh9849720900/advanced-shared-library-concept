def call(Map config) {
    echo "Deploying to Kubernetes: ${config.clusterName}"
    sh "kubectl config use-context ${config.context}"
    //sh "kubectl apply -f ${config.manifest}"
}
