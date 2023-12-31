def call(){
    pipeline{
        agent any
        stages{
            stage('git clone'){
                when{ expression { env.name.equals('chaitu') } }
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
            stage('docker-build'){
                steps{
                    echo "docker build is on-gonig"
                }
            }
        }
    }
}


  
