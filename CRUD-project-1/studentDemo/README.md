# Student & Product Management System

A RESTful Spring Boot application that demonstrates CRUD (Create, Read, Update, Delete) operations for managing Students and Products using Spring Boot, Spring Data JPA, Hibernate, and PostgreSQL.

## Features

### Student Management

* Add Student
* View All Students
* Get Student By ID
* Search Students By Name
* Search Students By Age
* Update Student Details
* Delete Student

### Product Management

* Add Product
* Add Multiple Products
* View All Products
* Get Product By ID
* Filter Products By Price
* Update Product Details
* Delete Product

---

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Lombok
* Maven

---

## Project Structure

```text
src/main/java/me/mano/studentDemo

├── controller
│   ├── StudentController.java
│   └── ProductController.java
│
├── entity
│   ├── Student.java
│   └── ProductEntity.java
│
├── repo
│   ├── StudentRepo.java
│   └── ProductRepo.java
│
├── service
│   ├── StudentService.java
│   └── ProductService.java
│
└── StudentDemoApplication.java
```

---

# Database Configuration

## PostgreSQL Setup

Create a PostgreSQL database:

```sql
CREATE DATABASE studentdb;
```

Configure `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```

---

## Maven Dependency

```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

---

# Student Entity

| Field    | Type   |
| -------- | ------ |
| id       | Long   |
| name     | String |
| email    | String |
| password | String |
| age      | int    |

### Validation Rules

* Age must be greater than or equal to 18.
* Student name length must be between 4 and 49 characters.
* Email must be unique.

---

# Product Entity

| Field        | Type          |
| ------------ | ------------- |
| productId    | Long          |
| productName  | String        |
| productDesc  | String        |
| productPrice | Double        |
| productImage | byte[]        |
| category     | Enum          |
| createdAt    | LocalDateTime |
| updatedAt    | LocalDateTime |

### Product Categories

```java
ELECTRONICS
CLOTHING
FOOD
BOOK
OTHER
```

---

# Student API Endpoints

## Add Student

```http
POST /student/add
```

Request Body

```json
{
  "name": "Manoharan",
  "email": "manoharan@gmail.com",
  "password": "12345",
  "age": 21
}
```

---

## Get All Students

```http
GET /student/get
```

---

## Get Student By ID

```http
GET /student/get/{id}
```

Example:

```http
GET /student/get/1
```

---

## Get Students By Name

```http
GET /student/getByName/{name}
```

Example:

```http
GET /student/getByName/Manoharan
```

---

## Get Students By Age

```http
GET /student/getByAge/{age}
```

Example:

```http
GET /student/getByAge/21
```

---

## Update Student

```http
PUT /student/update/{id}
```

Request Body

```json
{
  "email": "updated@gmail.com",
  "password": "newpassword",
  "age": 22
}
```

---

## Delete Student

```http
DELETE /student/delete/{id}
```

---

# Product API Endpoints

## Add Product

```http
POST /product/add
```

Request Body

```json
{
  "productName": "Laptop",
  "productDesc": "Gaming Laptop",
  "productPrice": 65000,
  "category": "ELECTRONICS"
}
```

---

## Add Multiple Products

```http
POST /product/addAll
```

Request Body

```json
[
  {
    "productName": "Laptop",
    "productPrice": 65000,
    "category": "ELECTRONICS"
  },
  {
    "productName": "Book",
    "productPrice": 500,
    "category": "BOOK"
  }
]
```

---

## Get All Products

```http
GET /product/get
```

---

## Get Product By ID

```http
GET /product/get/{id}
```

Example:

```http
GET /product/get/1
```

---

## Get Products Below a Given Price

```http
GET /product/check/{price}
```

Example:

```http
GET /product/check/50000
```

Returns all products whose price is less than or equal to the specified value.

---

## Update Product

```http
PUT /product/update/{id}
```

Request Body

```json
{
  "productName": "Updated Laptop",
  "productPrice": 70000,
  "category": "ELECTRONICS"
}
```

---

## Delete Product

```http
DELETE /product/delete/{id}
```

---

# Running the Application

Clone the repository:

```bash
git clone https://github.com/manoharan12105-beep/Backend-Spring-Boot.git
```

Navigate to the project directory:

```bash
cd CRUD-project-1
```

Build the project:

```bash
mvn clean install
```

Run the application:

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

# Future Improvements

* DTO Layer
* Global Exception Handling
* Bean Validation
* Swagger/OpenAPI Documentation
* Pagination & Sorting
* Unit Testing
* Spring Security Authentication & Authorization
* Product Image Upload Support

---

# Author

**Manoharan**

Spring Boot CRUD project developed for learning REST APIs, Spring Data JPA, Hibernate, and PostgreSQL.

---

# License

This project is intended for educational and learning purposes.
