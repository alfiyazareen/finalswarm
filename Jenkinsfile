pipeline{
     agent any
     stages{
         stage('Clone'){
              steps{
                 git 'https://github.com/alfiyazareen/finalswarm.git'
              }
         }
         stage('Build'){
              steps{
                 sh 'mvn clean package'
              }
         }
         stage('Build Docker Image'){
              steps{
                  sh 'docker build-t java-demo'
              }
         }
         stage('Deploy'){
              steps{
                  sh 'docker stack deploy-c swarm.yml javastack'
              }
         }
     }
}