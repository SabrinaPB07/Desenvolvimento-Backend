package com.example.ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Ex01Application {
	private static  List<Pokemon> pokedex = new ArrayList<>();

	// @GetMapping("/pokemons")
	// public List<Pokemon> getPokemons(){
	// 	return pokedex;
	// }

	@PostMapping
	public static String adicionarPokemon(@RequestBody Pokemon pokemon) {
		for (Pokemon pokemonNaLista : pokedex) {
			if (pokemon.getId() == pokemonNaLista.getId()) {
				return "Pokemon ja existe";
			}
		}
		pokedex.add(pokemon);
		return "Pokemon" + pokemon.getNome() + "incluido na pokedex";
	}
	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);
		pokedex.add(new Pokemon(1, "chamander"));
		pokedex.add(new Pokemon(2, "Squirtle"));
		pokedex.add(new Pokemon(1, "bulbassauro"));
	
	}

}
