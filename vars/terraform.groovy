def call(){
    try{
        pipeline{
            options {
                ansiColor('xterm')
            }
            agent{
            label 'workstation'
            }
            parameters {
                string(name: 'INFRA_ENV', defaultValue: '', description: 'Enter Env like dev or prod')
                choice(name: 'ACTION', choices: ['apply' , 'destroy'], description: 'Action')
            }
            stages{
                stage("terraform init"){
                    sh "terraform init -backend-config=env-${INFRA_ENV}/state.tfvars"
                }
                stage("terraform apply/destroy"){
                    sh "terraform ${ACTION} -auto-approve -var-file=env-${INFRA_ENV}/main.tfvars"
                }
            }
            post{
                always{
                    cleanWs()
                }
            }
        }
    }
}