#!Groovy

node(params.EXECUTORS_LABEL) {
    stage('Checkout') {
        deleteDir()
        checkout scm
    }

    stage("Tests Execution") {
        echo "----> Tests Execution stage started <----"
        bat "mvn test"
        echo "----> Tests Execution stage completed <----"
    }
}
