pipeline {
    agent any
    tools {
        jdk 'JAVA_HOME'
        maven 'MAVEN_HOME'
    }
    stages {
        stage('Clone') { 
            steps {
                git branch: 'origin', credentialsId: '99c7f765-4d20-47e6-b76e-482e0cfe356e', url: 'git@dc9fd9cf674a:root/PetClinic.git'
            }
        }
        stage('Validate') { 
            steps {
                sh 'mvn validate'
            }
        }
        stage('Compile') { 
            steps {
               sh 'mvn compile'
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test'
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn package'
            }
        }
        stage('Deploy') { 
            steps {
                //input 'Deploy?'
                //sh 'mvn tomcat7:deploy'
                echo 'Deploy Stage'
            }
        }
    }
}