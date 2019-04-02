pipeline {
    agent any
    stages {
        stage('Build & Deploy') {
            steps{
                sh "oc new-app https://github.com/jmindermann/axonIvy.git --name=jenkins1"
             }
        }
    }
}
