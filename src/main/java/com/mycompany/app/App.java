package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
/**
pipeline {

agent any

stages {

stage('Checkout') {

steps {

git branch: 'main', url:
'https://github.com/azadCMRIT/hello-maven.git' // Replace with
your repository URL

}

}

stage('Build') {

steps {

// Use 'mvn clean package' for Maven or 'gradle
build' for Gradle

sh 'mvn clean package'

}

}

stage('Test') {

steps {

// Run unit tests using Maven or Gradle

sh 'mvn test'

}

}

// Add additional stages for deployment, code analysis, etc.
as needed

}

}
 git config --global push.autoSetupRemote 
true
 git push origin main
  git remote add origin 
git@github.com:cmritsarada/exp6
 ssh-keygen -t ed25519 -C "your_email@example.com"

*/
