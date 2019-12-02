package org.demo

def timedGradleBuild(tasks) {
   timestamps {
      sh "${tool 'maven3'}/bin/mvn ${tasks}"
   }
}
