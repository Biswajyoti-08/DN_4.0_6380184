Here is the `README` content written in **plain text format**:

---

# Exercise 9: Spring Boot Library Management System

This folder contains the solution to **Exercise 9**, where we build a Spring Boot application for managing books in a library system. The goal is to simplify configuration and deployment using Spring Boot.

---

## Folder Structure

* `library` – Contains the complete Spring Boot project with:

  * Book entity class
  * BookRepository interface
  * BookController with REST endpoints
  * `application.properties` configuration

* `spring boot output` – Contains Postman test results and sample responses for all REST endpoints after successful testing.

---

## Technologies Used

* Spring Boot
* Spring Web
* Spring Data JPA
* H2 In-Memory Database
* Maven
* Postman (for API testing)

---

## How to Run the Application

1. Open the `library` folder in your IDE (such as IntelliJ or Eclipse)

2. Run the application using the main class
   OR
   Use the terminal:

   ```
   ./mvnw spring-boot:run
   ```

3. Access the H2 Database Console (optional):
   URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   JDBC URL: jdbc\:h2\:mem\:testdb
   Username: sa
   Password: (leave blank)

---

## application.properties Configuration

```
spring.datasource.url=jdbc:h2:mem:testdb  
spring.datasource.driverClassName=org.h2.Driver  
spring.datasource.username=sa  
spring.datasource.password=  
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect  
spring.h2.console.enabled=true  
```

---

## Available API Endpoints

GET     /books           – Get all books
GET     /books/{id}      – Get a book by ID
POST    /books           – Add a new book
PUT     /books/{id}      – Update an existing book
DELETE  /books/{id}      – Delete a book by ID

All endpoints are tested and working correctly using Postman. Screenshots and responses are saved in the `spring boot output` folder.

---

## Sample JSON for POST request

```
{
   "bookId":1
  "bookName": "Spring in Action",
  "price": 499
}
```

---

## Notes

* This exercise demonstrates how to create a complete CRUD REST API using Spring Boot and H2.
* It can be extended further by adding more entities, validations, and relationships.

---

# End of README