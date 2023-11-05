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

def compile() {
  if(app_lang == "nodejs") {
    echo "compile is going on nodejs"
    sh 'sleep 20'
  }
  if(app_lang == "maven") {
    //sh 'mvn package ; mv target/${component}-1.0.jar ${component}.jar'
    echo "compile is going on maven"
    sh 'sleep 20'
  }
}
def sonar(sonarquality){
 if (sonarquality == "AWS"){
  echo "artifact upload to Aws done by SonarQube"
 }
  else{
    echo "artifact upload to Aws--to normail done by SonarQube"
  }
}

