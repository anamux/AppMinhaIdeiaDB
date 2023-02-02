package com.anamuxfeldt.appminhaideiadb.datamodel;

public class ClienteDataModel {

    ///Modelo Objeto Relacional - transforna um objeto em uma tabela
    //Toda Classe Data Model tem que ter a seguinte estrutura


    // 1 - Atributo nome da tabela
    public static final String TABELA = "cliente";

    // 2 - Atributos um para um com os nomes dos campos
    public static final String ID = "id"; ///no SQLite = integer
    public static final String NOME = "nome"; ///no SQLite = text
    public static final String EMAIL = "email"; // no SQLite = text

    // 3 - Query para criar a tabela no banco de dados
    public static String queryCriarTabela = "";

    // 4 - Método para gerar o Script para criar a tabela
    public static String criarTabela(){

        //Concatenação de String
        queryCriarTabela += "CREATE TABLE " +TABELA+"(";
        queryCriarTabela += ID+" integer primary key autoincrement, ";
        queryCriarTabela += NOME+" text, " ;
        queryCriarTabela += EMAIL+" text";
        queryCriarTabela += ")";
        //queryCriarTabela = "Parte 01, Parte02, Parte03, Parte 04


        return queryCriarTabela;
    }
    // 5 - Queries de consultas gerais

}
