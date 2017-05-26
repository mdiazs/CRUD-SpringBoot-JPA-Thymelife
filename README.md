# CRUD-SpringBoot-JPA-Thymelife

Introduction:

This is a CRUD application which uses the following technologies:
	- Spring Boot
	- Spring Data JPA
	- MySQL
	- Thymeleaf


Process:

Access to: https://start.spring.io

Select the following dependencies:
	- Web
	- JPA
	- MySQL
	- Thymeleaf

This will generate the structure and configuration of the project, including the file "pom.xml". 
We will only have to focus on developing the code.

JPA, with the annotation @Entity allows to relate a class (POJO) with a table, in this case of MySQL.

In fact, this table will be created automatically, according to the properties of that class (POJO).
Not so, the database that we will have to create it manually.

I have used JPA to test the CRUD Repository interface, which provides the following methods: 

	- save
	- delete
	- findOne
	- findAll

The configuration for connecting to the MySQL database is done in the file:
	- application.properties

Deployment:

Spring Boot provides the Tomcat server. To deploy this application you must:

	1) Move to the root folder of the project.
	2) Run: mvn clean spring-boot:run
