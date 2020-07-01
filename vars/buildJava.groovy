def call(){
stage('Test') {
            steps {
		     sh 'mvn -f HelloWorldJava/pom.xml install'
				
            }
        }
}