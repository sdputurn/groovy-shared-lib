@Library('groovy-shared-lib@master')_

node() {
    stage("demo") {
        git 'git@github.com:jenkins-docs/simple-java-maven-app.git'
        def myUtils = new org.demo.buildUtils()
        myUtils.timedGradleBuild("clean package")

        // a "test"
        // timestamps { sh "ls -ltra; pwd" }
        // demo1 "test - ${BUILD_NUMBER}"
    }
}
// pipeline {
//     agent { label 'agent2'}
//     stages {
//         stage("test"){
//             steps {
//                 echo "hello world"
//                 bat "dir"
//                 bat "cd"
//             }
//         }
//     }
// }
// node("agent2") {
//     stage("demo") {
//         echo "hello world!!!!!!!"
//         bat "dir"
//         bat "cd"
//     }
// }
// node("agent1") {
//     stage ("abc") {
//         sh "pwd ; ls -ltra ; whoami"
//     }
// }
