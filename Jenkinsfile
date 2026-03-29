pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Paridhi-Gupta-17/Automation'
            }
        }

        stage('Run Automation Tests') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}

    post {
        always {
            archiveArtifacts artifacts: '**/target/surefire-reports/**', fingerprint: true
            archiveArtifacts artifacts: '**/test-output/**', fingerprint: true
        }
    }