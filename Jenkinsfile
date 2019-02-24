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
            
            stage('Build') {
                steps {
                    checkout scm

                    echo "Pulled Code!!"

                    //init(params.WORKSPACE)

                    echo 'Building using maven...'
                    sh 'mvn clean package -DskipTests'


					buildimage = "cidemo-build:${env.BUILD_NUMBER}"
                    echo "Image building"
                    buildImage("${buildimage}")
                }
           }
       }
}
            