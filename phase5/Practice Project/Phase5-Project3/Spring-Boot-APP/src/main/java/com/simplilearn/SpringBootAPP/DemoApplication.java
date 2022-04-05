package com.simplilearn.SpringBootAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String home(){
		return "Welcome to the Springboot Application in aws";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

