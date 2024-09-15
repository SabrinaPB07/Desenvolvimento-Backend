package com.example.uti.repository;

import java.io.File;
import java.util.List;

import com.example.uti.Medico;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;


public class MedicoRepository {
    private static final int ZERO_BYTES = 0;
    private File arquivo = new File("src/main/resources/database/tb_medicos.json");
    private ObjectMapper objectMapper = new ObjectMapper();

    public List<Medico> getAll() throws Exception {
        if(!arquivo.exists()) {
            arquivo.createNewFile();
        }

        List<Medico> medicos = null;
        if (arquivo.length() > ZERO_BYTES) {
            medicos = objectMapper.readValue(arquivo, new TypeReference<ArrayList<Medico>>() {});
        } else { 
            medicos = new ArrayList<>();
        }

        return medicos;
    }

     public boolean save(Medico medico) throws Exception {
       List<Medico> medicos = this.getAll();
       
        for (Medico medicosNoBanco : medicos) {
            if (medico.getId() == medicosNoBanco.getId()) {
                return false;
            } 
        }
        medicos.add(medico);
        return true;
    }
}
