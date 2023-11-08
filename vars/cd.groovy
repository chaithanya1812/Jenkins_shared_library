def name(name){
pipeline{
agent any
  stages{
      stage('first'){  
            steps{
              echo "name is ${name}"
            }
            }
}

}
}
