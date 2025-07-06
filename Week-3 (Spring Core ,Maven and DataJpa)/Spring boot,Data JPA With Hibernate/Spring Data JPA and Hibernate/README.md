

---

**Employee Management System – Spring Boot Project**

This project demonstrates an Employee Management System built using Spring Boot, Spring Data JPA, and H2 Database. It supports full CRUD operations, entity relationships, custom queries, auditing, pagination, and sorting.

---

**Technologies Used:**

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 In-Memory Database
* Lombok
* Maven

---

**Project Structure:**

* `model/`

  * `Employee.java`: Represents an employee, including ID, name, email, and department.
  * `Department.java`: Represents a department with a one-to-many relationship to employees.

* `repository/`

  * `EmployeeRepository.java`: Extends `JpaRepository` for Employee CRUD and search.
  * `DepartmentRepository.java`: Extends `JpaRepository` for Department CRUD.

* `controller/`

  * `EmployeeController.java`: REST API for managing employees.
  * `DepartmentController.java`: REST API for managing departments.

* `application.properties`: Configures H2 database and JPA behavior.

* `pom.xml`: Maven build file with dependencies.

---

**How to Run:**

1. Open the project in IntelliJ or Eclipse.
2. Run the main class: `EmployeeManagementSystemApplication.java`.
3. Open H2 Console at: [http://localhost:3000/h2-console](http://localhost:3000/h2-console)

   * JDBC URL: `jdbc:h2:mem:testdb`
   * Username: `sa`
   * Password: `password`
4. Use Postman to test the REST API at `http://localhost:3000`.

---

**Implemented Features:**

**Exercise 1: Project Setup**

* Spring Boot configured with required dependencies and H2 in-memory DB.

**Exercise 2: Entity Creation**

* Employee and Department entities created with a one-to-many relationship.

**Exercise 3: Repositories**

* Spring Data JPA repositories implemented for both entities.

**Exercise 4: CRUD Operations**

* RESTful endpoints implemented for create, read, update, delete operations.

**Exercise 5: Custom Query Methods**

* Search by name (`findByNameContaining`) and custom email query using `@Query`.

**Exercise 6: Pagination and Sorting**

* Endpoints added to retrieve paged and sorted employee data.

**Exercise 7: Auditing**

* Timestamps for creation and modification using `@CreatedDate` and `@LastModifiedDate`.

**Exercise 8: Projections (extendable)**

* Ready for interface- or class-based projections if required.

**Exercise 9: Externalised Config & Datasource**

* DB properties are configured in `application.properties`.

**Exercise 10: Hibernate Features (ready for extension)**

* Project structured for future Hibernate tuning and batch processing.

---


