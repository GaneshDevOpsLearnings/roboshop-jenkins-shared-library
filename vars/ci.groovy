def call(){
    pipeline{
        agent{
         label 'workstation'
        }
        stages{
            stage('complile'){
                steps{

                }
            }
            stage('unit test'){
                steps{

                }
            }
            stage('Quality analysis'){
                steps{

             }
            }
            stage('Uploading the code to centrialized place'){
                steps{

             }
            }
    }
}
}