[![Build Status](https://travis-ci.com/Kotauror/travis-gradle-test.svg?branch=master)](https://travis-ci.com/Kotauror/travis-gradle-test)

This is a sample project to try using gradle tasks & Travis CI.

## Building the jar, running the program

To build a jar go to the root of the project and run ./gradlew jar
To run the program using this jar file go to `./build/libs/` and run `java -jar travis-demo.jar`

## Running tests 
At the root level run `gradle test`

#### Abut travis CI
The relevant files for using travis CI are: .travis.yml and build.gradle

In the .travis.yml I only defined the language of project and java verion:
```
language: java
jdk:
  - oraclejdk8
```
There is no need to write a build script here. The information necessary for build will be included in the build.gradle file.

You need to add a "java" plugin. Thanks to that plugin the project will know how to build itself.
```apply plugin: "java"```
Then we need to tell Gradle we're using java 8:
```sourceCompatibility = 1.8```
Gradle also needs to know about ```repositories{}``` and ```dependencies{}```

