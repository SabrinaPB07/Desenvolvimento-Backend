package com.example.uti.service;

import com.example.uti.Medico;
import com.example.uti.repository.MedicoRepository;
import java.util.List;

public class MedicoService {
    private MedicoRepository repository = new MedicoRepository();

    public List<Medico> listarMedicos() throws Exception {
        return repository.getAll();
    }

    public String cadastrarNovoMedico(Medico medico) throws Exception {
        if (repository.save(medico)) {
            return "medico da especialidade " + medico.getEspecialidade() + "foi adicionado com sucesso";
        }

        return "cada medico deve ter seu id unico!!!";
    }
}
