# restful-web-services

> In this project, we implement some basic but usefull features of RESTful Web Services. The most important thing of this project is that it implements the Richardson Maturity Model Level Three (Level three of maturity makes use of all three i.e. URIs and HTTP and HATEOAS)!

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Features](#features)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
Through this project, we want to put into practice what we learned from Udemy regarding RESTful web services!

## Technologies
* Spring boot 2.1.3.RELEASE
* Spring boot Actuator
* Spring data Jpa
* Spring security
* Spring HATEOAS
* Swagger2 - version 2.9.2
* Swagger-ui - version 2.9.2

## Features
Here are the useful best practices features you are discovering in this project:
* Design Resources and GET, POST and DELETE operations

`UserResource.java` , ` HelloWorldController.java`

* Implement RESTful interaction through hypermedia using Spring HATEOAS

`UserResource.java`

* Implement Validation for RESTful Web Services

* Implement dynamic filtering for RESTful Web Services
> Add @JsonFilter on a bean class
`SomeBean.java`

> Implement filtering
`FilteringController.java`

* Implement Internationalization for RESTful Web Services
> LocaleResolver creation in the entry class
`RestfulWebServicesApplication.java`

> Add basename property in the application.properties file
`spring.messages.basename=messages`

> Add messages.properties files according to the language
`messages.properties` `messages_fr.properties` etc

* Implement Generic Exception Handling for RESTful Web Services

` CusromizedResponseEntityExceptionHandler.java`

* Implement variaty of RESTful Web Services versioning strategies

` VersionController.java`

* Implement basic authentication with Spring Security

* How to document RESTful Web Services with Swagger?

> Swagger config class
`SwaggerConfig.java`

> Check the documentation by hiting URLs below

 http://localhost:8080/v2/api-docs  or http://localhost:8080/swagger-ui.html

* How to monitor RESTful Services with Spring Boot Actuator?

> Enable a lot of stuff of actuator using hal browser, add following config in application.properties
`management.endpoints.web.exposure.include=*`

> Hit http://localhost:8080/actuator or http://localhost:8080/browser/index.html to monitor de RESTful web services

* Connect RESTful Services to a backend with JPA

> All classes needed in the following package
`com.udemycourses.webservices.restfulwebservices`

## Inspiration
This project is a hands-on for the Udemy course : [Master Microservices with Spring Boot and Spring Cloud](https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud)
Many thanks to [Ranga Rao Karanam](https://www.linkedin.com/in/rangakaranam/) for this awesome course!

## Contact
Created by [@Wilson Koffi KOMLAN](https://www.linkedin.com/in/wilkom2009/) - feel free to contact me!
