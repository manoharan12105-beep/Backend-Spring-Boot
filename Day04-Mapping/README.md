# Day04 - Spring Boot Request Mapping

This directory contains examples demonstrating how different HTTP request mappings work in **Spring Boot**.

The examples cover the most commonly used annotations for building REST APIs:

* `@GetMapping`
* `@PostMapping`
* `@PutMapping`
* `@DeleteMapping`
* `@PathVariable`
* `@RequestParam`
* `@RequestBody`

These examples help understand how Spring Boot maps HTTP requests to controller methods.

---

## 📚 Concepts Covered

### GET Mapping

Used to retrieve data from the server.

Examples include:

* Simple GET request
* GET request using `@PathVariable`
* GET request using `@RequestParam`

Example URLs:

GET http://localhost:8080/getmap/get

GET http://localhost:8080/getmap/get/Manoharan

GET http://localhost:8080/getmap?name=Manoharan

---

### POST Mapping

Used to send data to the server and create a new resource.

Example endpoint:

POST http://localhost:8080/postmap/create

Request Body (JSON):

{
"name": "Mano",
"age": 20
}

Example response:

User created: Mano, Age: 20

---

### PUT Mapping

Used to update an existing resource.

Example endpoint:

PUT http://localhost:8080/putmap/update/1

Request Body (JSON):

{
"name": "Mano",
"age": 21
}

Example response:

User with ID: 1 updated with Name: Mano and Age: 21

---

### DELETE Mapping

Used to remove a resource from the server.

Example endpoint:

DELETE http://localhost:8080/deletemap/delete/5

Example response:

User with id 5 deleted successfully

---

## 🔎 Important Annotations

| Annotation        | Purpose                                       |
| ----------------- | --------------------------------------------- |
| `@RestController` | Marks the class as a REST controller          |
| `@RequestMapping` | Defines base URL for endpoints                |
| `@GetMapping`     | Handles HTTP GET requests                     |
| `@PostMapping`    | Handles HTTP POST requests                    |
| `@PutMapping`     | Handles HTTP PUT requests                     |
| `@DeleteMapping`  | Handles HTTP DELETE requests                  |
| `@PathVariable`   | Reads values from the URL path                |
| `@RequestParam`   | Reads values from query parameters            |
| `@RequestBody`    | Converts JSON request body into a Java object |

---

## 🎯 Learning Outcome

By completing the examples in this folder, you understand how to:

* Create REST endpoints in Spring Boot
* Handle different HTTP request methods
* Extract data from URL paths
* Read query parameters
* Accept JSON request bodies

These concepts form the **foundation of building REST APIs in Spring Boot**.
