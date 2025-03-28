package com.mydockerproject.mydockerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MydockerprojectApplication {

	@GetMapping("/")
	public String sayHi(){
		return "Welcome to My Docker from Github action CI/CD";
	}

	public static void main(String[] args) {
		SpringApplication.run(MydockerprojectApplication.class, args);
	}

}
