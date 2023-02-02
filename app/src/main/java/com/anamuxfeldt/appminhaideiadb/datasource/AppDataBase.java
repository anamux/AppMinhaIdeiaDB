package com.anamuxfeldt.appminhaideiadb.datasource;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.anamuxfeldt.appminhaideiadb.api.AppUtil;
import com.anamuxfeldt.appminhaideiadb.datamodel.ClienteDataModel;
import com.anamuxfeldt.appminhaideiadb.datamodel.ProdutoDataModel;


///criando banco de dados
public class AppDataBase extends SQLiteOpenHelper {

    private static final String DB_NAME = "AppMinhaIdeia.sqlite";
    private static final int DB_version = 1;

    SQLiteDatabase db; //objeto que acessa o BD

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_version);
        Log.d(AppUtil.TAG, "AppDataBase: Criando Banco de Dados");

        db = getWritableDatabase();
    }

    //cria o banco de dados
    @Override
    public void onCreate(SQLiteDatabase db) {

       db.execSQL(ClienteDataModel.criarTabela());
       Log.d(AppUtil.TAG, "onCreate: Tabela Cliente criada..."+ClienteDataModel.criarTabela());
       db.execSQL(ProdutoDataModel.criarTabela());
       Log.d(AppUtil.TAG, "onCreate: Tabela Produto criada... "+ProdutoDataModel.criarTabela());


    }
///"controle de versão" faz as alteraçõs da versao
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
