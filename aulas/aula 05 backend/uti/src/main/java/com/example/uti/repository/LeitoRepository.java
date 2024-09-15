package com.example.uti.repository;
import java.util.*;

import com.example.uti.Leito;

public class LeitoRepository {
    private List<Leito> leitos = new ArrayList<>();

    public List<Leito> getAll() {
        return leitos;
    }

    public boolean save(Leito leito) {
        for (Leito leitoNoBanco : leitos) {
            if (leito.getId() == leitoNoBanco.getId()) {
                return false;
            }
        }
        leitos.add(leito);
        return true;
    }
}
