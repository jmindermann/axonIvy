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
                     sh "oc delete bc,dc,svc,route -l app=tasks -n cicd"
                     // create build. override the exit code since it complains about exising imagestream
                     sh "oc new-build --name=tasks --image-stream=jenkins2 --binary=true --labels=app=tasks -n cicd || true"
                     // build image
                     sh "oc start-build tasks --from-dir=oc-build --wait=true -n cicd"
                     // deploy image
                     sh "oc new-app tasks:latest -n cicd"
                     sh "oc expose svc/tasks -n cicd"
                }
            }
        }
    }
}
