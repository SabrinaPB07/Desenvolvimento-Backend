package com.example.ex01.repository;

import com.example.ex01.model.Instrumento;

import java.math.BigDecimal;
import java.util.*;

public class InstrumentoRepository {

    private List<Instrumento> instrumentos = new ArrayList<>();

    public InstrumentoRepository() {
        instrumentos.add(new Instrumento(1, "Trompete", new BigDecimal(2000.99)));
        instrumentos.add(new Instrumento(2, "Guitarra", new BigDecimal(4007.50)));
    }

    public void save(Instrumento instrumento) {
        //comunicacao com banco
        // envio do instrumento para persistencia
        instrumentos.add(instrumento);
    }

    public List<Instrumento> getAll() {
        return instrumentos;
    }


}
