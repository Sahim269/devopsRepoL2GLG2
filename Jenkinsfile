pipeline {
     agent {
        docker {
            image 'maven:3.9.6-eclipse-temurin-17'
        }
    }
    stages {
        stage('compile') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}   
