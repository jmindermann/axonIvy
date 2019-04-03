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
                     //sh "oc project cicd"
                     // clean up. keep the image stream
                     //sh "oc delete bc,dc,svc,route -l app=axonivy -n cicd"
                     // create build. override the exit code since it complains about exising imagestream
                     //sh "oc new-build https://github.com/jmindermann/axonIvy --name=axonivy2"
                     // build image
                     sh "oc start-build axonivy2 --from-build=axonivy2" //--from-dir=oc-build"
                     //sh "oc start-build axonivy2 . --wait=true -n cicd"
                     // deploy image
                     sh "oc new-app localhost:5000/axonivy2:latest --name=axonivy2"
                     sh "oc expose svc/axonivy2"
                }
            }
        }
    }
}
