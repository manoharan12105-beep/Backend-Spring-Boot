package com.example.SpringApplication.Mapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/putmap")
public class PutMap {
  @PutMapping("update/{id}")
  public String putMethodName(@PathVariable String id, @RequestBody User user) {
    return"User with ID: " + id + " updated with Name : " + user.getName() + " and Age : " + user.getAge();
  }
  /*
  Postman:
  - Method: PUT
  - Body: raw, JSON
      {
          "Name" : "Mano",
          "Age" : 20
      }
  - Class => User.java with Lombok annotations to generate getters, constructors, etc.
  - URL: http://127.0.0.1:8080/putmap/update/23CS088
  - output:
      User with ID: 23CS088 updated with Name : Mano and Age : 20
  
  */
}
