package com.example.uti.service;

import java.util.List;

import com.example.uti.Leito;
import com.example.uti.repository.LeitoRepository;

public class LeitoService {
    private LeitoRepository repository = new LeitoRepository();

    public List<Leito> listarLeitos(){
        return repository.getAll();
    }

    public String cadastrarNovoLeito(Leito leito) {
        if (repository.save(leito)) {
            return "leito de numero " + leito.getNumeroQuarto() + "foi adicionado com sucesso!";
        }

        return "leitos devem ter id unico!!!";
    }
}
