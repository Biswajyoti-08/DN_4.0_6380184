
---

## 🌍 Spring Boot RESTful Web Service – Country API

This project demonstrates a RESTful Web Service built with Spring Boot that allows users to perform CRUD operations on **Country** resources. It showcases the use of:

* HTTP method types (`GET`, `POST`, `PUT`, `DELETE`)
* Request validation using Jakarta Bean Validation (`@Valid`, `@NotNull`, `@Size`)
* Exception handling through a global exception handler
* JSON mapping via Jackson
* Invocation via Postman or `curl`
* Optional XML bean configuration (`country.xml`)

---

## 📁 Project Structure

```
spring-learn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/cognizant/springlearn/
│   │   │       ├── controller/
│   │   │       │   └── CountryController.java
│   │   │       ├── service/
│   │   │       │   └── CountryService.java
│   │   │       ├── dao/
│   │   │       │   └── CountryDao.java
│   │   │       ├── model/
│   │   │       │   └── Country.java
│   │   │       ├── exception/
│   │   │       │   ├── CountryNotFoundException.java
│   │   │       │   └── GlobalExceptionHandler.java
│   │   │       └── SpringLearnApplication.java
│   ├── resources/
│   │   ├── application.properties
│   │   └── country.xml
├── pom.xml
└── README.md
```

---

## 🚀 How to Run

### 🔧 Prerequisites

* Java 17+
* Maven 3.6+
* IDE (IntelliJ, Eclipse, or VS Code)

### ▶️ Run the application

```bash
mvn clean install
mvn spring-boot:run
```

Spring Boot will start on:
📍 `http://localhost:8090`

---

## 📬 API Endpoints

| Method | Endpoint            | Description            |
| ------ | ------------------- | ---------------------- |
| GET    | `/countries`        | Get all countries      |
| GET    | `/countries/{code}` | Get country by code    |
| POST   | `/countries`        | Add new country        |
| PUT    | `/countries`        | Update country         |
| DELETE | `/countries/{code}` | Delete country by code |

---

## 🔄 Sample curl Commands

### ✅ Get All

```bash
curl -X GET http://localhost:8090/countries
```

### 🔍 Get by Code

```bash
curl -X GET http://localhost:8090/countries/IN
```

### ➕ Add Country

```bash
curl -X POST http://localhost:8090/countries \
  -H "Content-Type: application/json" \
  -d '{"code":"UK","name":"United Kingdom"}'
```

### ✏️ Update Country

```bash
curl -X PUT http://localhost:8090/countries \
  -H "Content-Type: application/json" \
  -d '{"code":"UK","name":"Britain"}'
```

### ❌ Delete Country

```bash
curl -X DELETE http://localhost:8090/countries/UK
```

---

## ✅ Input Validation

Implemented using:

* `@NotNull`
* `@Size(min=2, max=2)`
* `@Valid` on method parameters

If validation fails, the API returns a `400 Bad Request` with the exact error message.

---

## 🛑 Global Exception Handling

Custom error responses are returned when:

* Input fails validation
* Country not found (`404`)
* Invalid formats (`400`)

Handled using:

```java
extends ResponseEntityExceptionHandler
```

---

## 📦 Optional XML Configuration

To demonstrate traditional Spring bean configuration, `country.xml` is included under `resources/`.
You can use it in `SpringLearnApplication.java` like:

```java
ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
```

---

## 🛠 Technologies Used

* Spring Boot 3.1.3
* Jakarta Bean Validation
* Jackson
* Maven
* Java 17
* Postman / curl

---

## 📚 References

* [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
* [RESTful API Design Guidelines](https://restfulapi.net/resource-naming/)
* [Jakarta Validation](https://jakarta.ee/specifications/bean-validation/)

---


