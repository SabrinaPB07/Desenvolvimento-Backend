package com.example.ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Ex01Application {

	@GetMapping("/{senha}")
	public String verificarSenha(@PathVariable("senha") String senha){
		if (senha == "senha123"){
			return "Entrada autorizada";
		} else {
			return "Entrada não autorizada";
		}

		
	}
	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);
	}

}
