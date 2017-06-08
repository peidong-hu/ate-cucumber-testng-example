# Integration of ATE, Cucumber-JVM and TestNG

This repo demos how to integrate ATE with cucumber-jvm and testng as the runner.

## Basic Integration

To have a simple integration you just need to create a runner class and just extend it from AbstractTestNGCucumberTests.
The StepDefs is using the ateCucumber module to run the xml defined ate steps.

### src/test/java/com.cucumber.testng.examples/DateStepdefs.java has the example

### To see this whole thing running simply checkout this project and run this command:
mvn clean test
