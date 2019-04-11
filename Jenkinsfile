pipeline {
    agent any
    stages {
        stage('Build') {
            steps{
                script {
                    sh "oc create -f ivy_deployment.yaml"
                    sh "oc create -f ivy_service.yaml"
                }
            }
        }
    }
}
