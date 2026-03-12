package com.example.SpringApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		System.out.println();
		System.out.println("Hi, I'm Manoharan.\nI'm a beginner in Spring Boot and I'm excited to learn more about it!");
	}

}
