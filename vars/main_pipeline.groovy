def pipeline(){
    node{
        stage('first'){
            echo "git-clone"
        }
        stage('second'){
            echo "build-stage"
        }
        stage('thrid'){
            echo "test-stage"
        }
    }
}
