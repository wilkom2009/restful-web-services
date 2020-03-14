# restful-web-services

> In this project, we implement some basic but usefull features of RESTful Web Services.

## Table of contents
* [General info](#general-info)
* [Features](#features)


## General info
Through this project, we want to put into practice what we learned from Udemy regarding RESTful web services!

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
> 

* How to connect RESTful Services to a backend with JPA?
