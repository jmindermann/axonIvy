pipeline {
    agent any
    stages {
        stage('build') {
            steps{
                script {
                    //sh "oc login -u jmindermann"
                    sh "oc new-app https://github.com/jmindermann/axonIvy.git --name=axon1 --strategy=docker"
                    sh "oc expose svc/axon1"
                }
            }
        }
    }
}
