package com.example.ecomm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button ClickBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.parseColor("#C80303"));
        getWindow().setNavigationBarColor(Color.parseColor("#ffe0e0"));

        setContentView(R.layout.activity_main);
        ClickBTN=findViewById(R.id.ClickBtn);

        ClickBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Introduction.class);
                startActivity(intent);
            }
        });
    }
}