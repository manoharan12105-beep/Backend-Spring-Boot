package com.example.SpringApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Welcome to Spring Boot Application!");
		System.out.println("Hi, I'm Manoharan .\nA CSE dev, I'm a beginner in Spring Boot and I'm excited to learn more about it!");
	}

}
