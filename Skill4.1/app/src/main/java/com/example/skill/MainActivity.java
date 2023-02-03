package com.example.skill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView etiqueta;
EditText campo1,campo2,campo3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
etiqueta=(TextView) findViewById(R.id.eti1);
campo1=(EditText) findViewById(R.id.txt1);
        campo2=(EditText) findViewById(R.id.txt2);
        campo3=(EditText) findViewById(R.id.txt3);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn1:
                obtenerInfo();
            break;
        }
    }

    private void obtenerInfo() {
    int numero=Integer.parseInt(campo1.getText().toString());
    String pass=campo2.getText().toString();
    String parrafo=campo3.getText().toString();
    etiqueta.setText("Nuevo Titulo!");
        Toast.makeText(getApplicationContext(),"Dato numerico: "+numero,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"Dato pass: "+pass,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"Dato Parrafo: "+parrafo,Toast.LENGTH_LONG).show();
    }


}