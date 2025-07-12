
---

## 📘 Spring Boot Assignment – Country REST Service

### 📁 Project Overview

This Spring Boot application demonstrates the implementation of a RESTful web service using XML-based configuration. It showcases basic CRUD-style endpoints that allow users to retrieve information about countries via HTTP requests.

---

### ✅ Features Implemented

1. **Get Default Country (`/country`)**

   * Loads the `"in"` bean (India) from `country.xml` using Spring XML configuration.
   * **Sample Response:**

     ```json
     {
       "code": "IN",
       "name": "India"
     }
     ```

2. **Get All Countries (`/countries`)**

   * Returns a list of countries configured in the `countryList` bean in `country.xml`.
   * **Sample Response:**

     ```json
     [
       { "code": "IN", "name": "India" },
       { "code": "US", "name": "United States" },
       { "code": "DE", "name": "Germany" },
       { "code": "JP", "name": "Japan" }
     ]
     ```

3. **Get Country by Code (`/countries/{code}`)**

   * Retrieves a country by its code (case-insensitive).
   * Uses a service layer to fetch the matching country.
   * **Sample Request:** `/countries/in`
   * **Sample Response:**

     ```json
     {
       "code": "IN",
       "name": "India"
     }
     ```

4. **Exception Handling – Invalid Country Code**

   * If a country code is not found, the system throws a `CountryNotFoundException`.
   * A global exception handler returns a detailed JSON error response.
   * **Sample Request:** `/countries/az`
   * **Sample Response:**

     ```json
     {
       "timestamp": "2025-07-11T10:40:00.123",
       "status": 404,
       "error": "Not Found",
       "message": "Country not found",
       "path": "/countries/az"
     }
     ```

---

### 🛠️ Technologies Used

* Java 11+
* Spring Boot
* Spring Web
* Spring Core (XML configuration)
* Maven
* REST APIs

---

### 📂 Directory Structure

```
com.cognizant.spring_learn
├── controller
│   └── CountryController.java
├── model
│   └── Country.java
├── service
│   └── CountryService.java
│   └── exception
│       └── CountryNotFoundException.java
├── exception
│   └── GlobalExceptionHandler.java
├── resources
│   └── country.xml
```

---

### 🚀 Running the Application

1. **Import** the project into your IDE as a Maven project.
2. Ensure `country.xml` is placed in `src/main/resources`.
3. Run the `SpringLearnApplication` class.
4. Test the APIs using:

   * Postman
   * Browser
   * cURL (e.g., `curl -i http://localhost:8083/countries/in`)

---

### 📌 Notes

* All countries are configured as Spring beans using XML configuration.
* Service layer handles country filtering logic.
* Global exception handling ensures proper JSON error output for failed requests.
* Case-insensitive matching is implemented for `/countries/{code}`.

---

