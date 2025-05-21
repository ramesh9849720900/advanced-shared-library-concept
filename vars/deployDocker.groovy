def call(Map config) {
    echo "Deploying Docker container: ${config.image}"
    sh "docker pull ${config.image}"
    sh "docker run -d -p ${config.port}:${config.port} ${config.image}"
}
