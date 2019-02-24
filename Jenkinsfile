 pipeline {
        agent any
        stages {
            stage('Env') {
                steps {
                    script {

                        tag = "cidemo-build-${env.BUILD_NUMBER}"

                        echo "config params: "
                        echo "docker image: ${tag}"
                        echo "Job Name: ${env.JOB_NAME}"
                        echo "WORKSPACE: ${env.WORKSPACE}"
                    }
                }
            }
        }
}
            