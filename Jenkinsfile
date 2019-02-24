 pipeline {
        agent any
        options { skipDefaultCheckout() } 

        stages {
            stage('Env') {
                steps {
                    script {
                        params.WORKSPACE = env.WORKSPACE
                        params.BUILD_NUMBER = env.BUILD_NUMBER
                        params.JOB_NAME = env.JOB_NAME

                        tag = "${params.DOCKER_IMAGE}-build-${params.BUILD_NUMBER}"

                        echo "config params: "
                        echo "projectkey: ${params.PROJECT_KEY}"
                        echo "docker image: ${params.DOCKER_IMAGE}"
                        echo "config directory: ${params.CONFIG_DIR}"
                        echo "migration: ${params.MIGRATION}"
                        echo "swagger spec: ${params.SWAGGER_FILE}"
                        echo "dev server: ${params.DEV_SERVER}"
                    }
                }
            }
        }
}
            