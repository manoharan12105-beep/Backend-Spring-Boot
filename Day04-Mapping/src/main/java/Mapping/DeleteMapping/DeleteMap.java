package com.example.SpringApplication.Mapping;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deletemap")
public class DeleteMap {
  
  @DeleteMapping("/user/{id}")
  public String deleteUser(@PathVariable int id) {
    return "User with id " + id + " has been deleted.";
  }
  /*
  Postman URL: http://localhost:8080/deletemap/user/123
  Method: DELETE
  Response: "User with id 123 has been deleted."
  */
  
   @DeleteMapping("/delete")
    public String deleteUserId(@RequestParam int id) {
        return "User with id " + id + " deleted successfully";
    }
  /*
  Postman URL: http://localhost:8080/deletemap/delete?id=123
  Method: DELETE
  Response: "User with id 123 deleted successfully"
  */
}
