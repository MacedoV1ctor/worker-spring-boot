# Worker API

REST API developed with **Java and Spring Boot** for managing workers, departments and hour contracts.

This project is a **Spring Boot adaptation** of the object-oriented programming exercise proposed by DevSuperior, originally developed as a console application. The objective was to apply the same domain model in a REST API using Spring Boot, JPA and an in-memory database.

## 🚀 Technologies

* **Java 25**
* **Spring Boot 4.1.1**
* **Spring Web MVC**
* **Spring Data JPA**
* **Hibernate**
* **H2 Database**
* **Maven**

## 📚 Project Objective

The project represents a company structure where:

* A `Worker` belongs to a `Department`
* A `Worker` can have multiple `HourContract`
* Each contract contains:

  * Date
  * Value per hour
  * Number of hours
* The worker's income can be calculated based on the contracts performed in a specific month and year.

The project also applies concepts such as:

* Object-oriented programming
* Object composition
* Encapsulation
* Enumerations
* JPA entity mapping
* REST API development
* Repository pattern
* Date and time API with `LocalDate`

## 🏗️ Domain Model

```text
Department
    │
    │ 1
    │
    │ *
Worker
    │
    │ 1
    │
    │ *
HourContract
```

### Worker

A worker contains:

* Id
* Name
* Level
* Base salary
* Department
* Hour contracts

The worker level is represented by an enumeration:

```java
public enum WorkerLevel {
    JUNIOR,
    MID_LEVEL,
    SENIOR
}
```

### Department

Represents the department to which the worker belongs.

### HourContract

Represents a contract performed by a worker, containing:

* Date
* Value per hour
* Duration in hours

The contract also provides the total value of the contract.

## 📂 Project Structure

```text
src
└── main
    ├── java
    │   └── com.victor.worker
    │       ├── config
    │       ├── controller
    │       ├── dto
    │       ├── entities
    │       ├── repositories
    │       └── WorkerApplication.java
    │
    └── resources
```

### Main packages

**`config`**
Contains application configuration and database initialization.

**`controller`**
Contains the REST controllers responsible for handling HTTP requests.

**`dto`**
Contains Data Transfer Objects used to transfer data through the API.

**`entities`**
Contains the domain entities mapped with JPA.

**`repositories`**
Contains the repository interfaces used for data persistence with Spring Data JPA.

## 🌐 API


### Calculate Worker Income

```http
GET /workers/{id}/income/{year}/{month}
```

Calculates the worker's income for a specific month and year, considering the worker's base salary and the contracts performed during that period.

Example:

```http
GET /workers/1/income/2018/8
```

In this example, the API calculates the income of worker `1` for **August 2018**.

## 🗄️ Database

The project uses **H2 Database** as an in-memory database for development and testing.

The application also uses **JPA/Hibernate** for object-relational mapping between the Java entities and the database.

The database can be initialized with sample data through the project's configuration.

## ▶️ How to Run

### Requirements

Before running the project, make sure you have installed:

* Java 25
* Maven (optional, since the project includes the Maven Wrapper)

### Clone the repository

```bash
git clone https://github.com/MacedoV1ctor/worker-spring-boot.git
```

Enter the project directory:

```bash
cd worker-spring-boot
```

### Run with Maven Wrapper

On Windows:

```bash
mvnw.cmd spring-boot:run
```

Or, if Maven is installed:

```bash
mvn spring-boot:run
```

The application will start using the configured Spring Boot server.

## 🧪 H2 Database

During development, the application uses H2 as an in-memory database.

The H2 database is useful for testing the application's persistence layer without requiring an external database server.

## 📖 Original Exercise

This project was based on the following DevSuperior exercise:

**Preparando para o Spring: composição de objetos com Java - exercício resolvido**

The original exercise focuses on object composition, enums, encapsulation, date/time manipulation and business rules involving workers and hour contracts.

Original exercise:

https://devsuperior.com.br/blog/preparando-para-o-spring-composicao-de-objetos-com-java-exercicio-resolvido

The original exercise was developed as a console application. This repository adapts the same domain model to a REST API using Spring Boot, JPA and H2.

## 🎯 What I Learned

Through this project, I practiced:

* Java object-oriented programming
* Entity relationships
* `@Entity`, `@Id` and `@GeneratedValue`
* `@ManyToOne` and `@OneToMany`
* Spring Boot
* REST controllers
* `@GetMapping`
* `@PathVariable`
* DTOs
* Spring Data JPA repositories
* JPA/Hibernate persistence
* H2 database
* Maven
* Layered project organization
* Git and GitHub

## 🔮 Future Improvements

Possible improvements for future versions:

* Add `POST`, `PUT` and `DELETE` operations
* Add request validation with Bean Validation
* Implement global exception handling with `@ControllerAdvice`
* Add pagination
* Add automated tests with JUnit and Mockito
* Add API documentation with Swagger/OpenAPI
* Replace H2 with PostgreSQL
* Add Docker support
* Improve DTO mapping and service layer organization

## 👨‍💻 Author

**Victor Hugo**

GitHub:

https://github.com/MacedoV1ctor
