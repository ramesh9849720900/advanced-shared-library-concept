def call(Map config) {
    echo "Deploying to EC2 instance: ${config.instanceId}"
    sh "scp ${config.artifact} ec2-user@${config.instanceIp}:${config.targetDir}"
    sh "ssh ec2-user@${config.instanceIp} 'bash ${config.deployScript}'"
}
