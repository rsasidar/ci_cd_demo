 pipeline {
        agent any
        
        //options { skipDefaultCheckout() }
         
        stages {
            stage('Env') {
                steps {
                    script {

						docker_image = "cidemo-image"
                        dTtag = "${docker_image}:${env.BUILD_NUMBER}"

                        echo "config params: "
                        echo "docker image: ${dTtag}"
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
					script {
	                    echo "Image building"
	                    docker.build("${dTtag}")
	                }
                }
           }
           
           stage('Dev') {
                steps {
                	script {
	                    // Push Image to Nexus
						
						docker_image = "cidemo-image"
						
                        dTag = "${docker_image}:${env.BUILD_NUMBER}"
                        
						echo "checking image name"
						echo "Name ${dTag}"
						
						echo "Tagging image...."
					    
					    sh "docker tag ${dTag} 192.168.65.2:8123/${dTag}"
					    sh "docker login -u admin -p admin123 192.168.65.2:8123"
					    
					    echo "Pushing image to Nexus...."
					    sh "docker push 192.168.65.2:8123/${dTag}"
	                    
	                    echo "Pulling Docker image to Node Machine.."
						sh "sed -i '' 's/BUILD_NUMBER/${env.BUILD_NUMBER}/g' demo_deploy.yml"
						sh "kubectl apply -f demo_deploy.yml --record=true --validate=false"
						sh "kubectl apply -f demo_service.yml --record=true --validate=false"
	                    
	                }
                }
                post {
                    success {
                        echo "Deployed Successfully on Dev"
                        echo "Send mail and slack notification for dev deployment"
                        //shouldProceed(params, 'dev')
                    }

                    failure {
                        echo "DEV Deployment Failed !!"
                        //notifyDeployment(params, 'FAILURE', 'DEV')
                        //notifyHangoutsChat(params, 'FAIL', 'DEV')
                    }
                }
            }
       }
}
            