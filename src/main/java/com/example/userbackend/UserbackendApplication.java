package com.example.userbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@ComponentScan("com.example.userbackend")
@RestController
@RequestMapping("/api")
public class UserbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserbackendApplication.class, args);
	}
	
	@GetMapping("/path")
	public String getMethodName() {
		return new String("hELLO ");
	}


}
