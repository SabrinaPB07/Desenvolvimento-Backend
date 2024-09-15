package com.example.ex02.repository;
import java.util.*;

import com.example.ex02.model.Midia;

public class MidiaRepository {
    private List<Midia> midias = new ArrayList<>();

    public MidiaRepository() {
        midias.add(new Midia(1, "Titanic", "filme"));
    }

    public List<Midia> getAll(){
        return midias;
    }

    public void save(Midia midia){
        midias.add(midia);
    }

    
}
