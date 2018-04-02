# Backbase// Solution Architect Assignment

## Overview
Java web application based on the standard servlet spec
The web application should provide a REST api to create a list of ING ATMs in a given Dutch city and return a well formed JSON response
The web application should invoke an external service to gather a super set of the data:  https://www.ing.nl/api/locator/atms/
Create a page that shows the list of ING ATMs
Use Spring and Maven.  

## Bonus features
Use of Apache Camel to route the web service call
Secure the page with Spring security
Unit tests using jUnit

## Expected output
A war file - it will be deployed into a vanilla Tomcat 7 instance and expect to work
Zip file of project and name / version of IDE used to create it
Document explaining the solution and how it was implemented.

# How to run the project 

- The easiest way to run the project is to run the executable jar within the embedded Tomcat servlet container provided by Spring’s support for as the HTTP runtime.
- Steps:  
	* Checkout using 
	* Go to root folder of the project: ingatms\
	* Run executable jar from the command prompt:  mvn package && java -jar target/ingatms-0.0.1-SNAPSHOT.jar
	* Access the application: http://localhost:8080/
	
-  As it was requested, a WAR file was also packaged for external Tomcat, but not tested!!

# Solution 

## Development Tools 
JAVA: 1.8.0_144
Editor: Spring Tool Suite(STS) Version: 3.9.1.RELEASE
Maven: apache-maven-3.5.3
Main libraries:  sprint-boot-2.0.0, thymeleaf-3.0.9

## Implementation 

- Use handy Spring Initializr (https://start.spring.io/) to bootstrap a skeleton Spring Boot web application with essential dependencies.   
- Spring security login page is already added 
- Import into STS
- 
https://developers.google.com/maps/documentation/javascript/adding-a-google-map#key

