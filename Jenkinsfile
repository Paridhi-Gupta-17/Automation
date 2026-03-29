node {

    stage('Checkout Code') {
        git branch: 'main', url: 'https://github.com/Paridhi-Gupta-17/Automation'
    }

    stage('Run Automation Tests') {
        bat 'mvn clean test'
    }

    stage('Archive Reports') {
        archiveArtifacts artifacts: '**/target/surefire-reports/**', fingerprint: true
    }
}