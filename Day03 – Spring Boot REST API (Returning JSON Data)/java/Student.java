package com.example.SpringApplication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
  private String name;
  private int age;
  // public Student(String name, int age) {
  //   this.name = name;
  //   this.age = age;
  // }
  // public String getName() {
  //   return name;
  // }
  // public int getAge() {
  //   return age;
  // }
  // @Override
  // public String toString() {
  //   return "POJO [name=" + name + ", age=" + age + "]";
  // }
  
}
