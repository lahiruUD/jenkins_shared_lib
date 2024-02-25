// Define a function called sonarQubeAnalysis
def sonarQubeAnalysis() {
    // Use withSonarQubeEnv to set up SonarQube environment
    withSonarQubeEnv('sonar') {
        // Execute the SonarQube scanner command
        sh "$SCANNER_HOME/bin/sonar-scanner -Dsonar.projectKey=Full-Stack -Dsonar.projectName=Full-Stack -Dsonar.java.binaries=."
    }
}
