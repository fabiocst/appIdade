package com.example.appidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText campo1= (EditText) findViewById(R.id.txtAnoAtual);
        final EditText campo2= (EditText) findViewById(R.id.txtAnoNasc);
        final TextView texto = (TextView) findViewById(R.id.txtResultado);
        final Button calcular = (Button) findViewById(R.id.btnCalcular);
        final Button proxTela = (Button) findViewById(R.id.btnProx);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nasc,atual,total=0;
                try{
                    atual= Integer.parseInt(campo1.getText().toString());
                    nasc = Integer.parseInt(campo2.getText().toString());
                    total=atual-nasc;
                    if(total<18){
                        texto.setText("Voce é menor de idade, com "+total+" anos");
                    }else{
                        texto.setText("Você e maior de idade, com "+total+" anos");
                    }
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Valores Inválidos!!",Toast.LENGTH_SHORT).show();

                }
            }
        });

        proxTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });


    }
}