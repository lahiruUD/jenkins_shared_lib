/*def call(String project, String ImageTag, String hubUser) {

    withDockerRegistry(credentialsId: 'docker-cred-new', toolName: 'docker') {
        sh "docker image push ${hubUser}/${project}:${ImageTag}"
        sh "docker image push ${hubUser}/${project}:latest"

    }


    withCredentials([usernamePassword(
            credentialsId: "docker-cred",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
        }
    sh "docker image push ${hubUser}/${project}:${ImageTag}"
    sh "docker image push ${hubUser}/${project}:latest"

} */