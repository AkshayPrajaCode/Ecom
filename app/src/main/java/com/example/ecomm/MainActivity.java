package com.example.ecomm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.parseColor("#C80303"));
        getWindow().setNavigationBarColor(Color.parseColor("#ffe0e0"));

        setContentView(R.layout.activity_main);

        //Timer that show to next Activity in That time
        //Timer Function with loader
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),Introduction.class);
                startActivity(intent);
                finish();

                Log.e("TAG", "run: Go to one Activity to another Activity With the help of Timer function" );
            }
        },1500);





    }
}