package com.example.SpringApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




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
  //Path Variable
  @GetMapping("/{id}")
  public String deleteToDo(@PathVariable int id) {
      return "ToDo with id " + id + " Deleted Successfully";
  }
  
  @GetMapping("")
    String getIdByIdParam(@RequestParam("todoId")String id){
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
