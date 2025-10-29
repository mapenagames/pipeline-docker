#!groovy
env.GIT_BASE_URL = "https://github.com" //URL Git
//********************* Fin Declaración Variables *******************//
//
//***** Carga SharedLibs *****//
library(
    changelog: false,
    identifier: 'alm@main',
    retriever: modernSCM(
        [
            $class: 'GitSCMSource',
            //credentialsId: env.GIT_CRED,
            remote: "${env.GIT_BASE_URL}/mapenagames/pipeline-docker",
            traits: [
                [ $class: 'jenkins.plugins.git.traits.BranchDiscoveryTrait' ],
                [ $class: 'CleanAfterCheckoutTrait']
            ]
        ]
    )
)
//
node (){

    stage("Ejecución ▶️") {
        alm_Utilidades.messages("probando","info")
    } 

    stages {
        stage("Carga 🕛") {
            cleanWs()
            alm_Utilidades.currentDate()
            alm_Utilidades.logRotator()
            alm_VarsEnv()

        }
        stage("docker Image 🕛") {
            steps {
                script {
                    alm_Utilidades.messages("imagen alpine:latest","info")
                    docker.image('alpine:latest').inside {
                        sh 'echo "Hola desde Docker!"'
                        sh 'uname -a'
                    }
                }
            }
        }
    }

}