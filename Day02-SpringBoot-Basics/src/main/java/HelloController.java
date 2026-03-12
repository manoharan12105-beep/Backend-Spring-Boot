package com.example.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class HelloController {
 
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/start")
    public String getMethodName() {
        return "Starting Spring Boot Application";
    }
    
    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to Spring Boot Application!";
    }
}
