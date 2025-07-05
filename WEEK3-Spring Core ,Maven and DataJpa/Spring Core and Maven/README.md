
---

# Library Management – Spring Framework Exercises

This repository provides complete solutions for foundational exercises designed to help you learn and apply the core features of the **Spring Framework**, including **Dependency Injection (DI)** and **Aspect-Oriented Programming (AOP)**. Each exercise includes relevant configuration files, source code, and structure.

---

## 📁 Contents

### **Exercise 1: Configuring a Basic Spring Application**

* Maven project setup with Spring Core dependencies
* `applicationContext.xml` defining `BookService` and `BookRepository` beans
* Java classes:

  * `com.library.service.BookService`
  * `com.library.repository.BookRepository`
* Main class to load Spring context and demonstrate basic bean usage

---

### **Exercise 2: Implementing Dependency Injection**

* `BookRepository` is injected into `BookService` using setter injection
* Verified through service method calls in the main class
* Spring container manages bean dependencies declared in `applicationContext.xml`

---

### **Exercise 3: Logging with Spring AOP**

* Added `spring-aop` dependency in `pom.xml`
* Defined `LoggingAspect` class in `com.library.aspect` using `@Aspect`
* Logging execution time for methods using `@Around` advice
* Enabled AOP with `<aop:aspectj-autoproxy/>` in `applicationContext.xml`

---

### ✅ Exercises 4, 5, 7, and 8:

These exercises **share the same setup and configuration** as Exercises 1–3.

* Refer to `src/main/java` and `src/main/resources` for all relevant files.
* These serve as practice variations of the core concepts.

---

### 🚀 Exercise 6 & Exercise 9 – **Standalone Maven Projects**

* Exercises 6 and 9 are implemented as **separate Maven projects**
* Navigate to:

  * `exercise-6/` for Exercise 6
  * `exercise-9/` for Exercise 9
* Each project has its own `pom.xml`, source code, and Spring configuration for isolated execution.

---

## 🛠 Prerequisites

* Java Development Kit (JDK) 17 or later
* Apache Maven 3.6+

---

## 🚦 How to Run

### Clone the Repository

```bash
git clone <repository_url>
cd LibraryManagement
```

### Build the Project

```bash
mvn clean compile
```

### Run the Main Application

```bash
mvn exec:java -Dexec.mainClass="com.librarymanagement.App"
```

### For Exercise 6 and 9:

```bash
cd exercise-6
mvn clean compile
mvn exec:java -Dexec.mainClass="com.exercise6.MainApp"

cd ../exercise-9
mvn clean compile
mvn exec:java -Dexec.mainClass="com.exercise9.MainApp"
```

---

## 📂 Project Structure

* `src/main/java`: Source code and packages for service, repository, and aspects
* `src/main/resources`: Contains `applicationContext.xml`
* `pom.xml`: Maven project configuration

---

## 📝 Notes

* You can customise bean IDs, package names, or aspect pointcuts in `applicationContext.xml` as needed.
* Each exercise is modular, focusing on a specific Spring concept.

---

