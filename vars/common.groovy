def complile(){
    if(applang=="nodejs"){
        sh 'npm install'
    }
    if(applang=="maven"){
        sh 'mvn package'
    }
}