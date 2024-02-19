def call(){
    sh 'mvn clean install -DskipTests'. //run compile, jar copied to local, skip unit tests
}
