def language(language){
     if(language == "Maven"){
       echo "mvn clean package"
     }else if (language == "Nodejs"){
       echo "npm install"
     }
      else{
        echo "go language"
      }

}
