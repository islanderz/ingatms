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
	* Checkout using: git clone https://github.com/islanderz/ingatms.git  
	* Go to root folder of the project: ingatms\
	* Run executable jar from the command prompt:  mvn package && java -jar target/ingatms-0.0.1-SNAPSHOT.jar
	* Access the application: http://localhost:8080/
	* Login using  username: user ,  password: password 
	
-  As it was requested, a WAR file was also packaged for external Tomcat, but not tested!!

# Solution 
## Summary
Developed a web application using Spring Boot and related Spring MVC, Spring Security dependencies.  
The web application creates a list of ING ATMs on a web page based on the city selected from a dropdown. The application invokes an external web service and filters out selected city's ATMs.  The list of ATMs are plotted as markers on Google MAP, with the address details available by clicking on the marker.  
(Note: while the assignment also refers to exposing a webservice that creates list of ATMs for a given city, we thought it would be much more interesting to suggest a solution that creates the list of ATMs for a given city on a map, rather than simply exposing this functionality as service and having a page within the same application consuming that service.)

## Development Tools 
JAVA: 1.8.0_144
Editor: Spring Tool Suite(STS) Version: 3.9.1.RELEASE
Maven: apache-maven-3.5.3 

## Implementation 

- Used handy Spring Initializr (https://start.spring.io/) to bootstrap a skeleton Spring Boot web application with essential dependencies.   
- Spring security login page is already added, including Spring MVC configurations and Thymeleaf.  
- Imported into STS 
- Followed some guides to complete solution:
	https://spring.io/guides/gs/consuming-rest/  
	https://developers.google.com/maps/documentation/javascript/adding-a-google-map#key  

