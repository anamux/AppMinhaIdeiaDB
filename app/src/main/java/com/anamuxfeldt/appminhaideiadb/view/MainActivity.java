package com.anamuxfeldt.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.anamuxfeldt.appminhaideiadb.R;
import com.anamuxfeldt.appminhaideiadb.api.AppUtil;
import com.anamuxfeldt.appminhaideiadb.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App Minha Ideia DataBase");

        clienteController = new ClienteController(getApplicationContext());
    }
}