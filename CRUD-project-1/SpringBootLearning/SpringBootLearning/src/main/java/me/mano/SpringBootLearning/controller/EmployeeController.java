package me.mano.SpringBootLearning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.mano.SpringBootLearning.entity.Employee;
import me.mano.SpringBootLearning.entity.Employee2;
import me.mano.SpringBootLearning.repo.EmployeeRepo;
import me.mano.SpringBootLearning.repo.EmployeeRepo2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/joins")
public class EmployeeController {
  @Autowired
  private EmployeeRepo employeeRepo;
  
  @Autowired
  private EmployeeRepo2 employeeRepo2;

  @PostMapping("/addEmployee")
  public ResponseEntity<String> postMethodName(@RequestBody List<Employee> employees) {
    employeeRepo.saveAll(employees);

    return ResponseEntity.ok("Data Saved");
  }


   @PostMapping("/addEmployee2")
  public ResponseEntity<String> postMethodName1(@RequestBody List<Employee2> employees) {
    employeeRepo2.saveAll(employees);

    return ResponseEntity.ok("Data Saved");
  }

  @GetMapping("/query1/{start}/{end}/{age}")
  public ResponseEntity<List<Employee>> getMethodName(@PathVariable Long start, @PathVariable Long end, @PathVariable int age) {
      return ResponseEntity.ok(employeeRepo.query1(start, end, age));
  }
  

  
}
