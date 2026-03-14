# 🚀 Day 4 – Spring Boot REST API Mappings

Today I explored how different HTTP methods are handled in a Spring Boot REST Controller.

I implemented endpoints using:

- @GetMapping
- @PostMapping
- @PutMapping
- @DeleteMapping
- @PathVariable
- @RequestParam
- @RequestBody

These annotations are used to map HTTP requests to Java methods in REST APIs.

---

## 📂 Controller Example

```java
@RestController
@RequestMapping("/todo")
public class ToDoController {

  @GetMapping("/create")
  public String getMethodName() {
      return "ToDo Created Successfully";
  }

  @GetMapping("/update")
  public String updateToDo() {
      return "ToDo Updated Successfully";
  }

  @GetMapping("/{id}")
  public String deleteToDo(@PathVariable int id) {
      return "ToDo with id " + id + " Deleted Successfully";
  }

  @GetMapping("")
  String getIdByIdParam(@RequestParam("todoId") String id){
      return "ToDo with id " + id + " Deleted Successfully";
  }

  @GetMapping("/create/id")
  String createToDo(@RequestParam String Username, @RequestParam String Password){
      return "ToDo Created Successfully with Username: " + Username + " and Password: " + Password;
  }

  @PostMapping("/abc")
  public String postMethodName(@RequestBody String body) {
      return body;
  }

  @PutMapping("/doni/{id}")
  public String putMethodName(@PathVariable long id) {
      return "ToDo with id " + id + " Updated Successfully";
  }

  @DeleteMapping("/delete/{id}")
  public String deleteMethodName(@PathVariable long id) {
      return "ToDo with id " + id + " Deleted Successfully";
  }
}
```

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|------|------|-------------|
| GET | `/todo/create` | Create message |
| GET | `/todo/update` | Update message |
| GET | `/todo/{id}` | Path variable example |
| GET | `/todo?todoId=1` | Query parameter example |
| GET | `/todo/create/id` | Multiple query parameters |
| POST | `/todo/abc` | Receive request body |
| PUT | `/todo/doni/{id}` | Update resource |
| DELETE | `/todo/delete/{id}` | Delete resource |

---

## 🔑 Concepts Practiced

- REST Controller creation
- HTTP request mappings
- Path variables
- Query parameters
- Request body handling
- CRUD API basics

---

## 🛠 Tools Used

- Java
- Spring Boot
- REST API concepts
- Postman for testing

---

### 📅 Backend Learning Journey

Day 1 → Spring Boot Setup  
Day 2 → REST Controller Basics  
Day 3 → Lombok & Model Classes  
Day 4 → HTTP Methods & Request Handling
