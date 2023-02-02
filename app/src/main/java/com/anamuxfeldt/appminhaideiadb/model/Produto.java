package com.anamuxfeldt.appminhaideiadb.model;

import android.util.Log;

import com.anamuxfeldt.appminhaideiadb.api.AppUtil;
import com.anamuxfeldt.appminhaideiadb.controller.ICrud;

///Classe POJO, só deve ser implementado getters and setters
public class Produto {

    private int id;
    private String nomeProduto;
    private String fornecedorProdudo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto (String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFornecedorProdudo() {
        return fornecedorProdudo;
    }

    public void setFornecedorProdudo(String fornecedorProdudo) {
        this.fornecedorProdudo = fornecedorProdudo;
    }

}
