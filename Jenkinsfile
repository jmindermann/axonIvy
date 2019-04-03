pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps{
                // Get project from DXC GitHub repository
                git 'https://github.com/jmindermann/axonIvy.git'
            }
        }
        stage('Deploy') {
            steps{
                script {
                     sh "oc project cicd"
                     // clean up. keep the image stream
                     sh "oc delete bc,dc,svc,route -l app=axonIvy -n cicd"
                     // create build. override the exit code since it complains about exising imagestream
                     sh "oc new-build --name=axonIvy --strategy=docker . -n cicd"
                     // build image
                     sh "oc start-build axonIvy --from-dir=oc-build --wait=true -n cicd"
                     // deploy image
                     sh "oc new-app localhost:5000/axonIvy:latest --name=axonIvy"
                     sh "oc expose svc/axonIvy"
                }
            }
        }
    }
}
