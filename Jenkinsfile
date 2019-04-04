pipeline {
    agent any
    stages {
        /*stage('Checkout') {
            steps{
                // Get project from DXC GitHub repository
                git 'https://github.com/jmindermann/axonIvy.git'
            }
        }*/
        stage('Deploy') {
            steps{
                script {
                     sh "oc whoami"                     
                     //sh "oc login https://console.openshift.nip.io:8443 --username=jmindermann --password=poc2019"
                     //sh "oc project cicd"
                     //sh "oc new-app https://github.com/jmindermann/axonIvy.git --name=ax11"
                     /*sh "oc project cicd"
                     // clean up. keep the image stream
                     sh "oc delete bc,dc,svc,route -l app=a1 -n cicd"
                     // create build. override the exit code since it complains about exising imagestream
                     //sh "oc new-build https://github.com/jmindermann/axonIvy --name=a2"
                     // build image
                     sh "oc start-build a2" //--from-dir=oc-build"
                     // deploy image
                     sh "oc new-app localhost:5000/test999:latest --name=test999"
                     sh "oc expose svc/test999"*/
                }
            }
        }
    }
}
