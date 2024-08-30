package com.example.lista03.service;

import com.example.lista03.model.Pet;
import com.example.lista03.repository.PetsRepository;
import java.util.List;

public class PetsService {
    private PetsRepository repository = new PetsRepository();

    public List<Pet> listarPets() throws Exception{
        return repository.getAll();
    }

    public String cadastrarNovoPet(Pet pet) throws Exception {
        if (repository.save(pet)) {
            return"Pet " + pet.getNome() + " foi cadastrado com sucesso";
        }
        return "Pets devem ter ids unicos";
    }
}
