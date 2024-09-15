package com.example.ex01.service;
import java.util.*;

import com.example.ex01.model.Instrumento;
import com.example.ex01.repository.InstrumentoRepository;

public class InstrumentoService {
    private InstrumentoRepository repository = new InstrumentoRepository();

    public String cadastrarInstrumento(Instrumento instrumento) {
        for (Instrumento instrumentoNaLista : repository.getAll()) {
            if (instrumento.getId() == instrumentoNaLista.getId()) {
                return "ID já cadastrado";
            }
        }
        repository.save(instrumento);
        return "instrumento " + instrumento.getNome() + " cadastrado com sucesso";
    }

    public List<Instrumento> obterInstrumentosCadastrados(){
        return repository.getAll();
    }
}
