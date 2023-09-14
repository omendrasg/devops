node {
  stage("Clone") {
    git branch: 'main', url: 'https://github.com/omendrasg/devops.git'
  }

  stage("Compile") {
    ./mvnw clean install -DskipTests
  }

  stage("Tests") {
    ./mvnw test -Punit
  }
}