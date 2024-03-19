package com.example.ecomm;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class Addtoproduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtoproduct);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.parseColor("#C80303"));
    }
}