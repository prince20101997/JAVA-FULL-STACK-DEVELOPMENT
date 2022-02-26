package com.simlilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.simplilearn.controllers")
public class Springfiles1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springfiles1Application.class, args);
	}

}