package com.example.skill;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity4 extends AppCompatActivity {
   ToggleButton tgbtn;
   TextView txtEti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    tgbtn=(ToggleButton) findViewById(R.id.tgBtn1);
        txtEti=(TextView) findViewById(R.id.etiSeleccion);
    }
    public void onclick(View view){
        if (view.getId()==R.id.tgBtn1){
            if(tgbtn.isChecked()){
                txtEti.setText("Boton On");
            }else{
                txtEti.setText("Bototn off");
            }
        }

    }


}