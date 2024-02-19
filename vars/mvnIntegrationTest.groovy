def call(){
    sh 'mvn verify -DskipUnitTests' 
    // compilation, packaging, and running integration tests.
}
