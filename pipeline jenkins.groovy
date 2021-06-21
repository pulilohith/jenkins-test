pipeline{
    agent any
    stages{
        stage('started learning jenkins'){
            steps{
                echo "Hi lohith for starting your jenkins carrer"
                echo "continuous integration"
            }

        }
        stage('Growing in jenkins'){
            steps{
                echo "Hi lohith your in intermediate stage"
            }

        }
        stage("professional in jenkins"){
            steps{
                echo "Hi lohith your professional CI engineer"
            }
        }
       stage("senior CI enginner"){
            steps{
                echo "Hi lohith your senior Devops CI engineer"
            }
        }
    }
}
