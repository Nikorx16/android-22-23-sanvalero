package com.example.skill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity7_1 extends AppCompatActivity {
    TextView msj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main71);
    msj=(TextView) findViewById(R.id.txtNombreMsj);
    Bundle miBundle=this.getIntent().getExtras();
    if(miBundle!=null){
        String nombre=miBundle.getString("nombre");
        String msj=getString(R.string.text_msj_bienvenida);
        
        msj.setText(msj+" "+nombre );


    }
    }
    public void onclick(View view){
        finish();
    }
}