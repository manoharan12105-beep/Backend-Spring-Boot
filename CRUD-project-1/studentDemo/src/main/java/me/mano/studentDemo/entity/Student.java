package me.mano.studentDemo.entity;

import org.hibernate.annotations.Check;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@Check(constraints = " age >= 18 AND length(student_name) > 3 AND length(student_name) < 50 ")
public class Student {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "student_name", length = 50, nullable = false)
  private String name;

  @Column(nullable = false, unique = true, updatable = false)
  private String email;

  @Column(nullable = false)
  private String password;

  @Column(nullable = false)
  private int age;
}
 