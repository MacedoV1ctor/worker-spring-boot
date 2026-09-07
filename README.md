# Worker API

REST API developed with Java and Spring Boot for managing workers, departments and hourly contracts.

This project is a Spring Boot adaptation of the Worker domain model proposed in a DevSuperior exercise, originally focused on practicing object composition and object-oriented programming concepts.

## About the Project

The application represents a simple worker management system.

A worker belongs to a department and can have multiple hourly contracts. The API allows these domain objects to be persisted and queried through a REST interface.

The original exercise focuses on concepts such as:

- Object-oriented programming
- Object composition
- Encapsulation
- Enumerations
- Domain modeling
- Business rules
- Java Date and Time API

In this version, these concepts were adapted to a Spring Boot application with persistence and REST endpoints.

## Domain Model

The main entities of the application are:

```text
Department
    │
    │
    └── Worker
          │
          └── HourContract
```

### Worker

Represents a worker and contains:

- Name
- Level
- Base salary
- Department
- Hourly contracts

### Department

Represents the department where the worker works.

### HourContract

Represents an hourly contract containing:

- Date
- Value per hour
- Number of hours

### WorkerLevel

Defines the worker's professional level:

```text
JUNIOR
MID_LEVEL
SENIOR
```

## Technologies

- Java 25
- Spring Boot 4
- Spring Web MVC
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

## Project Structure

```text
src/main/java/com/victor/worker
│
├── config
│
├── controller
│
├── dto
│
├── entities
│
├── repositories
│
└── WorkerApplication.java
```

### Layers

**Controller**

Responsible for receiving HTTP requests and returning API responses.

**DTO**

Used to represent data transferred through the API.

**Entities**

Contains the main domain objects of the application.

**Repositories**

Responsible for database access using Spring Data JPA.

**Config**

Contains application configuration and initial data setup.

## Database

The project uses an H2 database for development and testing purposes.

H2 allows the application to run without requiring an external database server.

## Running the Project

### Requirements

Before running the application, make sure you have installed:

- Java 25+
- Maven (optional, because the project includes Maven Wrapper)

### Clone the repository

```bash
git clone https://github.com/MacedoV1ctor/worker-spring-boot.git
```

### Enter the project directory

```bash
cd worker-spring-boot
```

### Run with Maven Wrapper

Windows:

```bash
.\mvnw.cmd spring-boot:run
```

Linux/macOS:

```bash
./mvnw spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

## API

The application provides REST endpoints for querying worker data.

Example:

```http
GET /workers/{id}
```

Example request:

```http
GET /workers/1
```

The response contains information about the worker and its associated department and contracts.

## Example

A worker can be associated with:

```text
Worker
├── Department
│   └── Design
│
└── Contracts
    ├── Contract 1
    ├── Contract 2
    └── Contract 3
```

The original business rule calculates the worker's income for a given month by adding the base salary to the value of contracts belonging to that month.

For example:

```text
Base salary:        1200.00
Contract 1:         1000.00
Contract 2:          800.00
--------------------------------
Monthly income:     3000.00
```

## What I Learned

This project helped me practice and understand:

- Object-oriented programming
- Object composition
- Java enumerations
- Encapsulation
- Domain modeling
- REST APIs
- Spring Boot
- Spring Data JPA
- Entity relationships
- DTOs
- Repository pattern
- Database persistence
- H2 database
- Maven

## Future Improvements

Possible improvements for future versions:

- [ ] Add complete CRUD operations
- [ ] Add validation with Bean Validation
- [ ] Add global exception handling
- [ ] Improve DTO structure
- [ ] Add unit and integration tests
- [ ] Add Swagger/OpenAPI documentation
- [ ] Replace H2 with PostgreSQL
- [ ] Add Docker support

## Reference

This project was inspired by the DevSuperior exercise:

[Preparando para o Spring: composição de objetos com Java](https://devsuperior.com.br/blog/preparando-para-o-spring-composicao-de-objetos-com-java-exercicio-resolvido)

The original exercise was created to practice object composition and object-oriented programming fundamentals before working with Spring.

## Author

Victor Macedo

GitHub: https://github.com/MacedoV1ctor
