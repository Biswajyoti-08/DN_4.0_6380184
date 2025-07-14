
---

**Spring Boot RESTful Web Services with Spring Security and JWT**

---

**Overview:**

This project demonstrates how to secure RESTful APIs using Spring Boot, Spring Security, and JSON Web Tokens (JWT). It includes:

* REST endpoints (`/countries`, `/authenticate`)
* In-memory user authentication
* Role-based access control
* Basic Authentication for token generation
* JWT-based stateless access control

---

**Project Structure:**

* `SpringLearnApplication.java`: Main Spring Boot application.
* `CountryController.java`: Provides a protected REST API `/countries`.
* `AuthenticationController.java`: Authenticates users and returns JWT at `/authenticate`.
* `SecurityConfig.java`: Configures security rules and user credentials.
* `Country.java`: Model class representing a country.
* `application.properties`: Server port and logging configuration.

---

**Users:**

Two in-memory users are defined in `SecurityConfig.java`:

1. Username: `user` | Password: `pwd` | Role: `USER`
2. Username: `admin` | Password: `pwd` | Role: `ADMIN`

---

**How to Run:**

1. Unzip the project.
2. In terminal or command prompt, navigate to the `spring-learn` folder.
3. Run the following commands:

```
mvn clean install
mvn spring-boot:run
```

Server will start on: `http://localhost:8090`

---

**How to Test Using Postman:**

1. **GET `/countries` without auth**

   * Should return 401 Unauthorized

2. **GET `/authenticate` with Basic Auth**

   * URL: `http://localhost:8090/authenticate`
   * Basic Auth:
     Username: `user`
     Password: `pwd`
   * Returns:
     `{ "token": "your-jwt-token" }`

3. **GET `/countries` with Bearer Token**

   * URL: `http://localhost:8090/countries`
   * Set Authorization Type: Bearer Token
   * Use the token from previous step

---

**Security Rules:**

* `/countries`: Accessible only to users with `USER` role
* `/authenticate`: Accessible to both `USER` and `ADMIN` roles

---

**Limitations:**

* Credentials are hardcoded for demo purposes.
* JWT validation is implemented only for `/authenticate`. Full stateless JWT protection for `/countries` can be added later.

---

**Next Steps (Optional Enhancements):**

* Store users in database with Spring Data JPA
* Secure all endpoints using JWT filters
* Add Swagger/OpenAPI for API documentation

---

