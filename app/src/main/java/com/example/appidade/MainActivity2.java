package com.example.appidade;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button btnVoltar= (Button) findViewById(R.id.btnTelaAnt);
        final Button btn =(Button) findViewById(R.id.button2);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity2.this,MainActivity.class);
               // startActivity(intent);
                onBackPressed();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alerta=new AlertDialog.Builder(Alerta.this);
                alerta.setTitle("Resultado");
                alerta.setMessage("Valeu");
                alerta.setNeutralButton("Boa Noite",null);
                alerta.show();
            }
        });


    }
}