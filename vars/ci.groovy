def call(){
    pipeline{
        agent{
         label 'workstation'
        }
        stages{
            stage('complile'){
                steps{
                        echo 'compilation phase'
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