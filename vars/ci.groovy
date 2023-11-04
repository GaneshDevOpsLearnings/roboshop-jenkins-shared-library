try{
    def call(){
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
                        
                    }
                }
                stage('Uploading the code to centrialized place'){
                    steps{
                         echo 'CODE UPLOad'
                    }
                }
            }
        }
    }
}
cache(Exception e){
    println("Exception: ${e}")
}