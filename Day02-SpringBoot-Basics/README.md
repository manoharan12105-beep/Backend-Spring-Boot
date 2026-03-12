# 🚀 Day 02 — Spring Boot Fundamentals

📅 Date: 11/03/2026

This project demonstrates basic concepts of Spring Boot including backend architecture, dependency injection, REST controllers, application configuration, actuator endpoints, and Lombok.

---

## 📖 Topics Covered

### 1️⃣ Introduction to Backend Development

Backend development focuses on:

* Server-side logic
* Processing client requests
* Database communication
* Sending responses back to the client

Architecture flow:

Client → Server → Database → Server → Client

---

### 2️⃣ Client–Server Architecture

A web application consists of two main parts.

**Client**

* Browser or mobile application
* Sends HTTP requests

**Server**

* Processes requests
* Executes business logic
* Sends responses

---

### 3️⃣ Monolithic vs Microservices Architecture

**Monolithic Architecture**

* Entire application is built as a single unit.

Advantages:

* Simple development
* Easy deployment

Disadvantages:

* Hard to scale
* Difficult to maintain for large systems

**Microservices Architecture**

* Application is divided into small independent services.

Advantages:

* Better scalability
* Independent deployment
* Easier maintenance

Disadvantages:

* Complex architecture
* Requires service communication

---

### 4️⃣ Spring Boot Concepts

Key Spring Boot features used in this project:

**Component Scan**
Automatically detects components like:

* `@Component`
* `@Service`
* `@Repository`
* `@Controller`

**Auto Configuration**
Spring Boot automatically configures the application based on dependencies.

**Actuator**
Provides monitoring and management endpoints.

Example endpoint:
`/actuator/health`

---

### 5️⃣ Dependency Injection (DI)

Dependency Injection allows Spring to automatically provide required objects.

Types of DI:

**Constructor Injection**

```
public Service(UserRepository repo){
    this.repo = repo;
}
```

**Setter Injection**

```
public void setRepo(UserRepository repo){
    this.repo = repo;
}
```

**Field Injection**

```
@Autowired
UserRepository repo;
```

Best practice → Constructor Injection

---

### 6️⃣ Application Properties

Configuration file location:

`src/main/resources/application.properties`

Example configuration:

```
server.port=8081
spring.application.name=spring-demo
```

Used to configure:

* server port
* database connection
* logging
* application settings

---

### 7️⃣ REST Controller

REST controllers handle HTTP requests.

Example:

```
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Boot!";
    }
}
```

Access in browser:

`http://localhost:8080/hello`

---

### 8️⃣ Lombok

Lombok reduces boilerplate code like getters and setters.

Example annotations:

`@Getter`    
`@Setter`  
`@NoArgsConstructor`  
`@AllArgsConstructor`

Dependency:

```
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>
```

---

## 📝 Assignments Completed

✔ Checked Spring Beans  
✔ Enabled Health Endpoint  
✔ Ran application on different ports  
✔ Used controller to return output  
✔ Uploaded project to GitHub  

---

## 🛠 Technologies Used

* Java
* Spring Boot
* Spring Boot Actuator
* Lombok
* Maven

---

## ▶️ Running the Application

Access endpoints:

`http://localhost:1000/welcome`  
`http://localhost:1000/actuator/health`

---

## 📌 Learning Outcome

After completing this project, I learned:

* Backend development fundamentals
* Client–server architecture
* Monolithic vs Microservices architecture
* Spring Boot core concepts
* Dependency Injection
* REST API basics
* Actuator monitoring
