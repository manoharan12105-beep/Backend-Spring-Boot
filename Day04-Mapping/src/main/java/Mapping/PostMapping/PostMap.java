package com.example.SpringApplication.Mapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/postmap")
public class PostMap {
  @PostMapping("/create")
  public String postMethodName(@RequestBody String entity) {
      return entity;
  }
  /*

  Postman:
  - Method: POST
  - Body: raw, JSON
      {
          "Name" : "Mano",
          "Age" : 20
      }
  - URL: http://127.0.0.1:8080/postmap/create

  -output:
      {
          "Name" : "Mano",
          "Age" : 20
      }
    */


  @PostMapping("/user")
  public String postMethodName(@RequestBody User user) {
      
      return "User created: " + user.getName() + ", Age: " + user.getAge();
  }
  /*
  Postman:
  - Method: POST  
  - Body: raw, JSON
      {
          "Name" : "Mano",
          "Age" : 20
      }

  - Class => User.java with Lombok annotations to generate getters, constructors, etc.

  - URL: http://127.0.0.1:8080/postmap/user
  - output:
      User created: Mano, Age: 20
  */
}
