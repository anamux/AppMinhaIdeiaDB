package com.anamuxfeldt.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;

import com.anamuxfeldt.appminhaideiadb.datamodel.ClienteDataModel;
import com.anamuxfeldt.appminhaideiadb.datamodel.ProdutoDataModel;
import com.anamuxfeldt.appminhaideiadb.datasource.AppDataBase;
import com.anamuxfeldt.appminhaideiadb.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController extends AppDataBase implements ICrud<Produto>{

    ContentValues dadodoObj;
    public ProdutoController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Produto obj) {
        dadodoObj = new ContentValues();

        dadodoObj.put(ProdutoDataModel.NOMEPRODUTO, obj.getFornecedorProdudo());
        dadodoObj.put(ProdutoDataModel.FORNECEDOR, obj.getFornecedorProdudo());
        return false;
    }

    @Override
    public boolean alterar(Produto obj) {
        dadodoObj = new ContentValues();

        dadodoObj.put(ProdutoDataModel.ID, obj.getId());
        dadodoObj.put(ProdutoDataModel.NOMEPRODUTO, obj.getNomeProduto());
        dadodoObj.put(ProdutoDataModel.FORNECEDOR, obj.getFornecedorProdudo());
        return false;
    }

    @Override
    public boolean deletar(Produto obj) {
        dadodoObj = new ContentValues();

        dadodoObj.put("id", obj.getId());
        return false;
    }

    @Override
    public List<Produto> listar() {

        return new ArrayList<>();
    }
}
