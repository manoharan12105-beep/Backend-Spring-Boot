package me.mano.studentDemo.controller;

import org.springframework.web.bind.annotation.RestController;

import me.mano.studentDemo.entity.Student;
import me.mano.studentDemo.service.StudentService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/student")
public class StudentController {

  @Autowired
  private StudentService studentService;

  @PostMapping("/add")
  public String addStudent(@RequestBody Student student) {
    return studentService.addStudent(student);
  }

  @GetMapping("/get")
  public List<Student> ListOfStudents() {
      return studentService.List1();
  }

   @GetMapping("/get/{id}")
    public Student getId1(@PathVariable Long id){
    return studentService.getId2(id);
  }
  
  @GetMapping("/getByName/{name}")
  public  List<Student> getMethodName(@PathVariable String name) {
      return studentService.getMethodName1(name);
  }
  
  @GetMapping("/getByAge/{age}")
  public  List<Student> getMethodAge(@PathVariable int age) {
      return studentService.getMethodAge1(age);
  }
  
  @PutMapping("/update/{id}")
  public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
      return studentService.updateStudent(id, student);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteStudent(@PathVariable Long id) {
    String name = studentService.getStudentName(id);
    studentService.deleteStudent(id);
    return "Deleted " + name + " Details Successfully";
  } 
  
}
