def call() {
   //general
    //https://github.com/mapenagames/pipeline-docker.git
    //Deploy
    env.GIT_ORG = "mapenagames"                                // de define mas abajo
    env.GIT_BRANCH = "main"                             // branch de repo github
    env.GIT_NOMBRE_REPO ="pipeline-docker"                         // identifica repo que se va a procesar

    //jenkins
    env.JENKINS_LOG_ROTATOR = 5                    // define la cantidad de ejecuciones que guarda jenkins
    env.JENKINS_DATE_START = env.tdatealm
    env.JENKINS_DATE_END = ""
    env.JENKINS_LAST_STAGE = env.STAGE_NAME
    env.JENKINS_BUILD_USER_ID = wrap([$class: 'BuildUser']) { return env.JENKINS_BUILD_USER_ID }
}