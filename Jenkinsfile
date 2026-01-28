pipeline {
    agent any
    tools{
	maven 'Maven_3.9'   
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
        stage('deploy'){
            steps{
                sh 'mvn clean deploy'
            }
        }
	stage('SonarQube Analysis') {
	   steps {
		withSonarQubeEnv('SonarQubeServer') { 
			sh 'mvn sonar:sonar'
		 }
	  }
	 }
    }
}   
