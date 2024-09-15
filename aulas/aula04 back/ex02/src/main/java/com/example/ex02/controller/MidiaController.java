package com.example.ex02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ex02.model.Midia;
import com.example.ex02.repository.MidiaRepository;
import com.example.ex02.service.MidiaService;
import java.util.*;

@RestController
@RequestMapping("/midias")
public class MidiaController {
    private MidiaService midiaService = new MidiaService();

    @GetMapping
    public List<Midia> getAll(){
        return midiaService.obterMidiasCadastradas();
    }

    @PostMapping
    public String salvarMidia(@RequestBody Midia midia) {
        return midiaService.cadastrarNovaMidia(midia);
    }
}
