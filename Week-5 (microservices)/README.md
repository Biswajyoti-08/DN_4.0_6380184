
---

# Spring Microservices Banking Suite

This repository is a hands-on microservices-based implementation of a banking system using Spring Boot, Spring Cloud Eureka, and Spring Cloud Gateway.

Each assignment has been implemented in a dedicated folder to reflect its microservice responsibility (e.g., `account`, `loan`, `greet-service`, etc.), following the microservices architecture best practices. This project demonstrates the progression from monolithic design limitations to a resilient and scalable microservices system.

---

## Folder Structure

| Folder Name              | Description                                                                                                                                                                                             |
| ------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `account`                | Microservice for managing bank account data. Implements REST API to fetch account details.                                                                                                              |
| `loan`                   | Microservice for handling loan data. Implements REST API to fetch loan information.                                                                                                                     |
| `accounteureka`          | Eureka-registered version of the `account` microservice.                                                                                                                                                |
| `eureka-discover-server` | A Spring Cloud Eureka Server that acts as a service registry.                                                                                                                                           |
| `eureka-server`          | Another instance of Eureka for learning and testing multiple environments.                                                                                                                              |
| `greet-service`          | A simple microservice returning a “Hello World” message via REST API, registered with Eureka.                                                                                                           |
| `api-gateway`            | Spring Cloud Gateway to route external requests to internal microservices. Includes a global logging filter. (Partially working due to deprecated modules used in the original hands-on specification.) |

---

## What Was Implemented

### Monolithic to Microservices

* Demonstrated how monolithic failures (like memory leaks) can bring down the whole system.
* Split services like account and loan into separate Spring Boot applications.

### Eureka Discovery Server

* Setup a Eureka Discovery Server on port `8761`.
* Registered `account`, `loan`, and `greet-service` microservices to the Eureka server.
* Services use `@EnableDiscoveryClient` and are visible at `http://localhost:8761`.

### Microservices

* Each service uses Spring Web, Eureka Discovery Client, and exposes RESTful endpoints.
* Examples:

  * `/accounts/{number}` returns dummy account data.
  * `/loans/{number}` returns dummy loan data.
  * `/greet` returns "Hello World".

### API Gateway

* Created using Spring Cloud Gateway.
* Configured to use Eureka for service discovery.
* Configured global filter to log all requests.
* Routes requests like `/greet-service/greet` through the gateway to the greet service.

---

## Known Issue with `api-gateway`

The API Gateway was not fully functional due to deprecated modules and incompatible configurations suggested in the original hands-on exercise (specifically `spring-cloud-starter-gateway-server-webmvc`).

A fixed version (reactive) was implemented using `spring-cloud-starter-gateway`, but minor compatibility issues still exist when applying some original instructions verbatim.

---

## How to Run

1. Build all projects using:

   ```bash
   mvn clean install
   ```

2. Start Eureka Discovery Server (`eureka-discover-server`).
   Visit: `http://localhost:8761`

3. Start individual services:

   * `account` → on port `8080`
   * `loan` → on port `8081`
   * `greet-service` → on port `8082` (or another port if configured)

4. Start API Gateway (`api-gateway`) on port `9090`.

5. Test Services via Gateway:

   ```
   http://localhost:9090/greet-service/greet
   http://localhost:9090/account-service/accounts/00987987973432
   http://localhost:9090/loan-service/loans/H00987987972342
   ```

---

## Output

Each microservice project folder contains its own working output (console screenshots, Postman screenshots, or browser outputs). Refer to respective folders for results.

---

## Technologies Used

* Java 21
* Spring Boot 3.5.x
* Spring Web
* Spring Cloud 2025.0.0
* Spring Cloud Eureka (Discovery Server & Client)
* Spring Cloud Gateway (Reactive)
* Maven

---

