package com.example.SpringApplication.Mapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/getmap")

public class GetMap {
  @GetMapping("/get")
  public String getMethodName() {
      return "Get Method Called Successfully";
  } 
  //http://127.0.0.1:8080/getmap/get

  @GetMapping("/get/{name}")
  public String getMethodName(@PathVariable String name) {
      System.out.println("Received name: " + name); 
      return "Get Method Called Successfully with name: " + name;
  }
  //http://127.0.0.1:8080/getmap/get/Manoharan
  

  @GetMapping
  public String getByParam(@RequestParam String name) {
      return "Get Method Called Successfully with name: " + name;
  }
  //http://127.0.0.1:8080/getmap?name=Manoharan

}
