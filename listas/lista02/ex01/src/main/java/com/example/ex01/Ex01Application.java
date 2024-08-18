package com.example.ex01;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.IlhaDeCalor;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Ex01Application {

	public static List<IlhaDeCalor> ilhasdeCalor = new ArrayList<>();

	@GetMapping("/ilhas-de-calor")
	public List<IlhaDeCalor> getIlhasDeCalores() {
		return ilhasdeCalor;
	}

	@PostMapping("/ilhas-de-calor")
	public static String adicionarIlha(@RequestBody IlhaDeCalor ilhaDeCalor) {
		for ( IlhaDeCalor ilhaNaLista : ilhasdeCalor) {
			if (ilhaDeCalor.getId() == ilhaNaLista.getId()) {
				return "Essa ilha ja existe";
			}
		}

		ilhasdeCalor.add(ilhaDeCalor);
		return "ilha de calor " + ilhaDeCalor.getBairro() + " Adicionada com Sucesso!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);
	}

}
