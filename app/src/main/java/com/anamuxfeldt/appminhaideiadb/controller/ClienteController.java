package com.anamuxfeldt.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.anamuxfeldt.appminhaideiadb.api.AppUtil;
import com.anamuxfeldt.appminhaideiadb.datamodel.ClienteDataModel;
import com.anamuxfeldt.appminhaideiadb.datasource.AppDataBase;
import com.anamuxfeldt.appminhaideiadb.model.Cliente;
import com.anamuxfeldt.appminhaideiadb.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ClienteController extends AppDataBase implements ICrud <Cliente>{

    ContentValues dadoDoObj;

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }

    @Override
    public boolean incluir(Cliente obj) {

        dadoDoObj = new ContentValues();
        ///Key, valor

        ////salva o dado/objeto na coluna Cliente no DataBase
        //ClienteDataModel ligação obj relacional

        dadoDoObj.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObj.put(ClienteDataModel.EMAIL, obj.getEmail());

        //Enviar os dados (dadoDoObj) para a classe AppDatabase
        //utilizando um metodo que add o obj no BD, qualquer tabela

        return false;
    }

    @Override
    public boolean alterar(Cliente obj) {

        dadoDoObj = new ContentValues();
        ///Key, valor


        ///Id é chave primária, salva automaticamente quando há novo registro
        //Sql -> UPDATE
        dadoDoObj.put(ClienteDataModel.ID, obj.getId());
        ////salva o dado/objeto na coluna Cliente no DataBase
        //ClienteDataModel ligação obj relacional
        dadoDoObj.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObj.put(ClienteDataModel.EMAIL, obj.getEmail());

        //Enviar os dados (dadoDoObj) para a classe AppDatabase
        //utilizando um metodo que alterar o obj no BD, qualquer tabela
        //respeitando o ID ou PK (Primary key)
        return false;
    }

    @Override
    public boolean deletar(Cliente obj) {
        dadoDoObj = new ContentValues();
        ///Key, valor


        ///Id é chave primária, salva automaticamente quando há novo registro
        //Sql -> DELETE from TABELA where ID = ????
        dadoDoObj.put(ClienteDataModel.ID, obj.getId());

        //Enviar os dados (dadoDoObj) para a classe AppDatabase
        //utilizando um metodo que deletar o obj no BD, qualquer tabela
        //respeitando a condiçao = ID ou PK (Primary key)

        return false;
    }

    @Override
    public List<Cliente> listar() {

        return new ArrayList<>();

    }
}
