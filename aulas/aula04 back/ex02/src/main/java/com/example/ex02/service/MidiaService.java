package com.example.ex02.service;

import com.example.ex02.model.Midia;
import com.example.ex02.repository.MidiaRepository;
import java.util.*;

public class MidiaService {
    private MidiaRepository repository = new MidiaRepository();

    public List<Midia> obterMidiasCadastradas(){
        return repository.getAll();
    }

    public String cadastrarNovaMidia(Midia midia){
        if(midia.getTitulo() == null || midia.getTitulo().isBlank()) {
            return "Titulo Invalido";
        }

        repository.save(midia);
        return "Midia " + midia.getTitulo() + " cadastrada com sucesso!";
    }


}
