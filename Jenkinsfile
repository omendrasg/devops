node {
  stage("Clone") {
    git branch: 'main', url: 'https://github.com/omendrasg/devops.git'
  }

  stage("Compile") {
    bat './mvnw clean install -DskipTests'
  }

  stage("Tests") {
    bat './mvnw test -Punit'
  }
}