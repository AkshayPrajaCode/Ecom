package com.example.ecomm;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.skydoves.elasticviews.ElasticButton;

public class BuyNow extends AppCompatActivity {
   ElasticButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buynow);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.parseColor("#C80303"));
        getWindow().setNavigationBarColor(Color.parseColor("#ffffff"));


        //Initization
        btn_back=findViewById(R.id.btn_back);
        //Back Button

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                Log.e("TAG", "onClick: Comeback to pervious Activity" );
            }
        });
    }
}