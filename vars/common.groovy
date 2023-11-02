def complile(){
    if(applang=="nodejs"){
        sh 'npm install'
    }
    if(applang=="maven"){
        sh 'mvn package'
    }
    if(applang=="go"){
        sh 'go mod init dispatch ; go get ; go build'
    }
}