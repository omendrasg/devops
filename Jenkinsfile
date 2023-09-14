node {
  stage("Clone") {
    git branch: 'main', url: 'https://github.com/omendrasg/devops.git'
  }

  stage("Compile") {
    sh "pwd"
    sh "./mvnw clean install -DskipTests"
  }

  stage("Tests") {
    sh "./mvnw test -Punit"
  }
}