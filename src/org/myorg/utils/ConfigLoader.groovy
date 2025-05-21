package org.myorg.utils

class ConfigLoader {
    static Map load(String team) {
        switch(team) {
            case 'teamA':
                return [
                    clusterName: 'default',
                    context: 'default',
                    manifest: 'resources/k8s/teamA-deployment.yaml'
                ]
            case 'teamB':
                return [
                    clusterName: 'default',
                    context: 'default',
                    manifest: 'resources/k8s/teamA-deployment.yaml'
                ]
            default:
                error "Unsupported team: ${team}"
        }
    }
}
