def call(){
    pipeline{
        agent any
        stages{
            stage('git clone'){
                when{ expression { "${env.name}"=="chaitu" } }
                steps{
                    echo "git cloneing"
                }
            }
            stage('compile-build'){
                steps{
                    script{
                        compile.language("${env.language}")
                    }
                }
            }
            stage('Quality-check'){
                steps{
                    echo "quality-checking"
                }
            }
            stage('docker-build1'){
                steps{
                    echo "docker build is on-gonig"
                }
            }
          stage('docker-build'){
                steps{
                    script {
                        cii.hello()
                    }
                }
            }
        }
    }
}

def chaitu(){
println "hello" 
}


  
