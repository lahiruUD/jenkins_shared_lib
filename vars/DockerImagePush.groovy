def call(String project, String ImageTag, String hubUser) {

    withCredentials([string(credentialsId: 'docker-cred', variable: 'docker')]) {
        sh ' docker login -u lahiruud -p ${docker}  '
}

    sh "docker image push ${hubUser}/${project}:${ImageTag}"
    sh "docker image push ${hubUser}/${project}:latest"

}
