def call(String project, String ImageTag, String hubUser) {

    withDockerRegistry(credentialsId: 'docker-cred-new') {
        
     sh "docker image push ${hubUser}/${project}:${ImageTag}"
     sh "docker image push ${hubUser}/${project}:latest"

}

}
