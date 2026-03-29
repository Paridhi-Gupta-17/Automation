node {

    stage('Checkout Code') {
        git branch: 'main', url: 'YOUR_GITHUB_REPO_URL'
    }

    stage('Run Automation Tests') {
        bat 'mvn clean test'
    }

    stage('Archive Reports') {
        archiveArtifacts artifacts: '**/target/surefire-reports/**', fingerprint: true
    }
}