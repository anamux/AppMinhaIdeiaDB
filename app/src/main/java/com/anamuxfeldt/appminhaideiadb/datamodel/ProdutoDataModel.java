package com.anamuxfeldt.appminhaideiadb.datamodel;

public class ProdutoDataModel {
    public static final String TABELA = "produto";

    public static final String ID = "id"; ///SQLite = integer

    public static final String NOMEPRODUTO = "nomeProduto";  ///SQLite = text

    public static final String FORNECEDOR = "fornecedorProduto"; ///SQLite = text

    public static String queryCriarTabela="";

    public static String criarTabela (){

        queryCriarTabela += "CREATE TABLE " +TABELA+"(";
        queryCriarTabela += ID+" integer primary key autoincrement, ";
        queryCriarTabela += NOMEPRODUTO+" text, " ;
        queryCriarTabela += FORNECEDOR+" text";
        queryCriarTabela += ")";

        return queryCriarTabela;
    }

}
