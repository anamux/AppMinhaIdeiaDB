package com.anamuxfeldt.appminhaideiadb.controller;

import java.util.List;

public interface ICrud <T> {

    //métodos de persistencia de dados no BD:
    //Incluir,
    public boolean incluir(T obj);

    // alterar,
    public boolean alterar(T obj);

    // deletar,
    public boolean deletar(T obj);

    // listar
    public List<T> listar();

}
