package com.example.ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Ex02Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex02Application.class, args);
	}

}
