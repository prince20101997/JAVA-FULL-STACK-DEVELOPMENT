package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn")
public class ApITwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApITwoApplication.class, args);
	}

}
