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

def test(){
    if(applang=="nodejs"){
        sh 'npm run test'
    }
    if(applang=="maven"){
        sh 'mvn test'
    }
    if(applang=="python"){
        sh 'python -m unittest'
    }
    if(applang=="go"){
        sh 'go test'
    }
}
