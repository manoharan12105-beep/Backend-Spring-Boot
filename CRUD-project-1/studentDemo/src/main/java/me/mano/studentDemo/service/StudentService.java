package me.mano.studentDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.mano.studentDemo.entity.Student;
import me.mano.studentDemo.repo.StudentRepo;

@Service
public class StudentService {
  @Autowired
  private StudentRepo studentRepo;

  public String addStudent(Student student) {
    studentRepo.save(student);
    return "saved Successfully :) ";
  }
  public List<Student> List1(){
    return studentRepo.findAll();
  }

  public Student getId2(Long id){
    return studentRepo.getById(id);

  }
  public List<Student>  getMethodName1(String name){
    return studentRepo.findByName(name);
  }

  public List<Student>  getMethodAge1(int age){
    return studentRepo.findByAge(age);
  }


  public Student updateStudent(Long id, Student student) {
    Student st1 = studentRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    st1.setEmail(student.getEmail());
    st1.setAge(student.getAge());
    st1.setPassword(student.getPassword());
 
    return studentRepo.save(st1);
  }

  public String getStudentName(Long id) {
    Student st = studentRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    return st.getName();
  }

  public void deleteStudent(Long id) {
    studentRepo.deleteById(id);
  }
}
