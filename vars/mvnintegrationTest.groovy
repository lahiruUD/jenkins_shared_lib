def call() {
    sh 'mvn test -DskipTests=true'
}