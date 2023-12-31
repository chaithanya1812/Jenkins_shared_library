def ci(){
pipeline{
agent any
  stages{
    stage('one'){
        steps{
         echo "Hello-world"
        }
    }
    stage('two'){
     steps{
        echo "Hello-world-2" 
     }
    }


  }


}
}
