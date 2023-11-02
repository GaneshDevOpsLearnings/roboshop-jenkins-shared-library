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
                        echo 'testingphase'
                }
            }
            stage('Quality analysis'){
                steps{
                        echo 'quality'
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