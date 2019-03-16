package com.example.derechochile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonAccount;
    private Button buttonDB;
    private Button buttonCourse;
    private Button buttonClassmate;
    private Button buttonShare;
    private Button buttonExit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        buttonAccount = findViewById(R.id.buttonAccount);
        buttonDB = findViewById(R.id.buttonDB);
        buttonCourse = findViewById(R.id.buttonCourse);
        buttonClassmate = findViewById(R.id.buttonClassmate);
        buttonShare = findViewById(R.id.buttonShare);
        buttonExit = findViewById(R.id.buttonExit);

        buttonAccount.setOnClickListener(this);
        buttonDB.setOnClickListener(this);
        buttonCourse.setOnClickListener(this);
        buttonClassmate.setOnClickListener(this);
        buttonShare.setOnClickListener(this);
        buttonExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonAccount:
                Toast.makeText(this, "Cuenta del Usuario", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonDB:
                Toast.makeText(this, "Base de datos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonCourse:
                Toast.makeText(this, "El curso", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonClassmate:
                Toast.makeText(this, "Acceso a la clase", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonShare:
                Toast.makeText(this, "Compartir", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonExit:
                Toast.makeText(this, "Salir", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
