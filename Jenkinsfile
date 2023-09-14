node {
  stage("Clone") {
    bat 'del /S ./*'
    git branch: 'main', url: 'https://github.com/omendrasg/devops.git'
  }

  stage("Build") {
    bat './mvnw clean install -DskipTests'
  }

  stage("Test") {
    bat './mvnw test -Punit'
  }
}