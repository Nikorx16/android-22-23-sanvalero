package com.example.skill;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Log.i("info","Valor informacion");
        Log.d("Debug","Valor debug");
        Log.w("Warning","Valor Warning");
        Log.e("Error","Valor Error");
        Log.v("Verbose","Valor Verbose");

        Log.i(TAG,"Mensaje Seguimiento 1");
        Log.d(TAG,"Mensaje Seguimiento 2");
        Log.w(TAG,"Mensaje Seguimiento 3");
        Log.e(TAG,"Mensaje Seguimiento 4");
        Log.v(TAG,"Mensaje Seguimiento 5");
    }
}