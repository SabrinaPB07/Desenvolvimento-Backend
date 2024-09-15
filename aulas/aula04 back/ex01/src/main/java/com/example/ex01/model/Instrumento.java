package com.example.ex01.model;

import java.math.BigDecimal;
import java.util.*;

public class Instrumento {
    private int id;
    private String nome;
    private BigDecimal preco;

    public Instrumento() {

    }

    public Instrumento(int id, String nome, BigDecimal preco ){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public BigDecimal getPreco(){
        return this.preco;
    }
    public void setPreco(BigDecimal preco){
        this.preco = preco;
    }
}