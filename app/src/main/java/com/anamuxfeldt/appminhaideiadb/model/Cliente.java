package com.anamuxfeldt.appminhaideiadb.model;

import android.util.Log;

import com.anamuxfeldt.appminhaideiadb.api.AppUtil;
import com.anamuxfeldt.appminhaideiadb.controller.ICrud;

///Classe POJO, só deve ser implementado getters and setters
public class Cliente{

    private int id; //chave primaria do BD
    private String nome;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
