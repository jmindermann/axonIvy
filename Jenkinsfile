pipeline {
    agent any
    stages {
        stage('Build') {
            steps{
                script {
                    sh "oc delete all -l app=ivy1"
                    sh "oc create -f ivy_pod.yaml"
                    sh "oc create -f ivy_service.yaml"
                    //sh "oc new-app https://github.com/jmindermann/axonIvy.git --name=axonivy --strategy=docker"
                    //sh "oc expose svc/axonivy"
                }
            }
        }
    }
}
