
---

# Spring REST Employee Management Service

This project demonstrates the integration of a RESTful web service using Spring Boot and XML configuration. It exposes two REST endpoints to fetch employee and department data stored in an XML file. The project follows the layered architecture with Controller, Service, and DAO layers.

## Objectives

* Develop and expose GET-based REST APIs using Spring Boot
* Use Spring XML configuration to load static data
* Test the service using Postman or a web browser
* Prepare backend for integration with Angular frontend

## Project Structure

```
spring-rest-employee/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/cognizant/springrest/
│   │   │       ├── controller/
│   │   │       ├── dao/
│   │   │       ├── model/
│   │   │       ├── service/
│   │   │       └── SpringRestEmployeeApplication.java
│   │   └── resources/
│   │       ├── employee.xml
│   │       └── application.properties
├── pom.xml
└── README.md
```

## REST Endpoints

* **GET /employees**
  Returns the list of all employees.

* **GET /departments**
  Returns the list of all departments.

## How to Run

### Prerequisites

* Java 8 or later
* Maven 3.x

### Steps

1. Clone or extract the project
2. Open terminal in the project directory
3. Run the following commands:

```
mvn clean install
mvn spring-boot:run
```

The server will start on port `8080`.

### Test URLs

* [http://localhost:8080/employees](http://localhost:8080/employees)
* [http://localhost:8080/departments](http://localhost:8080/departments)

## Technologies Used

* Java
* Spring Boot
* Spring Context (XML-based configuration)
* Maven

## Notes

* The `employee.xml` file contains static data for both employees and departments.
* No database is used in this demo.
* This is backend-only; frontend integration using Angular is assumed to be handled separately.

---

