def call(){
    try{
        pipeline{
            agent{
            label 'workstation'
            }
            stages{
                stage('complile'){
                    steps{
                        script{
                            common.compile()
                        }
                    }
                }
                stage('unit test'){
                    steps{
                        script{
                            common.test()
                            
                        }
                    }
                }
                stage('Quality analysis'){
                    steps{
                        echo 'sonarqube is on the way'
                        //sh "sonar-scanner -Dsonar.host.url=http://xxx:9000 -Dsonar.projectKey=${applang} -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.qualitygate.wait=true"
                    }
                }
                stage('Uploading the code to centrialized place'){
                    steps{
                         echo 'CODE UPLOad'
                    }
                }
            }
        }
    }catch(Exception e){
        println (failure in ${e})
    }
}