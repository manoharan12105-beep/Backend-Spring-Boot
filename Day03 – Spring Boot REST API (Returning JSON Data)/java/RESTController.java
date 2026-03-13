package com.example.SpringApplication;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    // Return a list of students
    @GetMapping("/students")
    public List<Student> getStudents(){
        // Add Data to POJO
        Student student1 = new Student("Adwitiya", 20);
        Student student2 = new Student("David", 21);
        Student student3 = new Student("Andrew", 20);

        // Create a new List
        List<Student> myList = new ArrayList<Student>();

        // Add Data to the list
        myList.add(student1);
        myList.add(student2);
        myList.add(student3);

        return myList;
    }
}
