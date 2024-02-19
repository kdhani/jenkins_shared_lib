def call(){
    sh 'mvn clean install -DskipTests'. //skip unit tests
}
