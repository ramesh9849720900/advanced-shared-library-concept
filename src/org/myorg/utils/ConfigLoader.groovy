package org.myorg.utils

class ConfigLoader {
    static Map load(String team) {
        switch(team) {
            case "teamA":
                return [clusterName: "cluster-a", image: "team-a/app:latest"]
            case "teamB":
                return [clusterName: "cluster-b", image: "team-b/app:latest"]
            default:
                return [:]
        }
    }
}
