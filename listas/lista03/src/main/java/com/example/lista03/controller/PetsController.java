package com.example.lista03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lista03.model.Pet;
import com.example.lista03.service.PetsService;

import java.util.List;

@RestController
@RequestMapping("/pets")

public class PetsController {
    private PetsService service = new PetsService();
    
    
    @GetMapping
    public List<Pet> listaPets() throws Exception{
        return service.listarPets();
    }

    @PostMapping
    public String cadastrarNovoPet(@RequestBody Pet pet) throws Exception{
        return service.cadastrarNovoPet(pet);
    }

}
