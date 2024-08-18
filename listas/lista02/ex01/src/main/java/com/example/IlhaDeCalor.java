package com.example;

public class IlhaDeCalor {
    private int id;
    private String bairro;
    private String zona;

    public IlhaDeCalor(){

    }

    public IlhaDeCalor(int id, String bairro, String zona){
        this.id = id;
        this.bairro = bairro;
        this.zona = zona;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id; 
    }

    public String getBairro(){
        return this.bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getzona(){
        return this.zona;
    }
    public void setZona(String zona){
        this.zona = zona;
    }
}
