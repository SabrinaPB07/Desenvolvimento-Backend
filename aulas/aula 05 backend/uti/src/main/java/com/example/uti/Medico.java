package com.example.uti;

public class Medico {
    private int id;
    private String especialidade;
    private boolean estaAtendendo;

    public  Medico(){

    }

    public Medico(int id, String especialidade, boolean estaAtendendo) {
        this.id = id;
        this.especialidade = especialidade;
        this.estaAtendendo = estaAtendendo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isEstaAtendendo() {
        return estaAtendendo;
    }

    public void setEstaAtendendo(boolean estaAtendendo) {
        this.estaAtendendo = estaAtendendo;
    }
    
}
