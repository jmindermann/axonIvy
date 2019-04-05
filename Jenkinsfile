pipeline {
    agent any
    stages {
        stage('Build') {
            steps{
                script {
                    sh "oc new-app https://github.com/jmindermann/axonIvy.git --name=axonivy --strategy=docker"
                    sh "oc expose svc/axonivy"
                }
            }
        }
    }
}
