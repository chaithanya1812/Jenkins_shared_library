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

def cal(int val){
    if (val<100) { 
         //If the condition is true print the following statement 
         println("The value is less than 100"); 
         echo "hello chaitu value is less than 100"
      } else { 
         //If the condition is false print the following statement 
         println("The value is greater than 100"); 
      }
}

