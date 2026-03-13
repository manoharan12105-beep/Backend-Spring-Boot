# 🚀 Day 3 – Spring Boot REST Controller & JSON Response

Today I learned how to build a simple REST API using Spring Boot that returns Java objects as JSON.

This project demonstrates how to create a REST endpoint that returns a list of students using a POJO class.

---

## 📚 Concepts Covered

- @RestController
- @RequestMapping
- @GetMapping
- Returning Java Objects as JSON
- Creating a POJO class
- Using Lombok for getters and setters
- Automatic JSON conversion using Jackson

---

## 🏗 Project Structure

```
src
 └─ main
     └─ java
         └─ com.example.SpringApplication
              ├─ Application.java
              ├─ RESTController.java
              └─ Student.java
```

---

## 📦 Student (Lombok)

```java
package com.example.SpringApplication;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name;
    private int age;

}
```

---

## 🌐 REST Controller

```java
package com.example.SpringApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    @GetMapping("/students")
    public List<Student> getStudents(){

        Student student1 = new Student("Adwitiya", 20);
        Student student2 = new Student("David", 21);
        Student student3 = new Student("Andrew", 20);

        List<Student> myList = new ArrayList<>();

        myList.add(student1);
        myList.add(student2);
        myList.add(student3);

        return myList;
    }
}
```

---

## ▶️ Run the Application

Start the Spring Boot application and open:

```
http://localhost:1000/api/students
```

---

## 📄 Example JSON Response

```json
[
  {
    "name": "Adwitiya",
    "age": 20
  },
  {
    "name": "David",
    "age": 21
  },
  {
    "name": "Andrew",
    "age": 20
  }
]
```

---

## 🧠 Key Idea

When the controller returns:

```
List<Student>
```

Spring Boot automatically converts the objects into JSON using Jackson.

---

## 📌 Next Step

Next I will learn:

- @PostMapping
- @RequestBody
- @PathVariable
- @RequestParam

These are essential for building real REST APIs.
