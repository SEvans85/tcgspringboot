package com.example.tcg1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tcg1Application {
	@GetMapping("/")
	public String home() { return "Hello world, from Team Victor"; }
	public static void main(String[] args) {
		SpringApplication.run(Tcg1Application.class, args);
	}
}
