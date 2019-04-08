pipeline {
    agent any
    stages {
        stage('Build') {
            steps{
                script {
                    sh "oc delete all -l app=axonivy"
                    sh "oc create -f ~/root/demo/ivy_pod.yaml"
                    //sh "oc create -f ~/root/demo/ivy_service.yaml"
                    //sh "oc new-app https://github.com/jmindermann/axonIvy.git --name=axonivy --strategy=docker"
                    //sh "oc expose svc/axonivy"
                }
            }
        }
    }
}
