package me.mano.studentDemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.mano.studentDemo.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

  List<Student> findByName(String name);
  List<Student> findByAge(int age);
} 
