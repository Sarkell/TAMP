#!Groovy

node("linux_slave") {
    stage('Checkout') {
        deleteDir()
        checkout scm
    }

    stage("Tests Execution") {
        echo "----> Tests Execution stage started <----"
        sh "mvn test"
        echo "----> Tests Execution stage completed <----"
    }
}
