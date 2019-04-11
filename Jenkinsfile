pipeline {
    agent any
    stages {
        stage('Build') {
            steps{
                script {
                    sh "oc create -f ivy_pod.yaml"
                    sh "oc create -f ivy_service.yaml"
                }
            }
        }
    }
}
