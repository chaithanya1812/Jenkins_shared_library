def call(){
pipeline{
  agent any
  stages{
     stage('first'){
       steps{
         echo "hello chaitu-from shared library"
       }
     }
  }
}
}
