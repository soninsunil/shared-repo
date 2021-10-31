import groovy.json.*
import groovy.json.JsonSlurperClassic
import org.jenkinsci.plugins.pipeline.modeldefinition.Utils

def run(Map config)
{
  def safeParams = config ?: [:]

  stage("SpecFlow Test Execution"){
  checkout scm
  // sh 'dotnet build'
  sh 'dotnet tool install --global SpecFlow.Plus.LivingDoc.CLI'
	sh 'echo hello'
  }
}
