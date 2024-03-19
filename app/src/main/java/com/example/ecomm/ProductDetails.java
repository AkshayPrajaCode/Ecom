package com.example.ecomm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.ecomm.SliderImage.RecylerAdapterImage;
import com.skydoves.elasticviews.ElasticButton;

public class ProductDetails extends AppCompatActivity {

    private ElasticButton arrowBack;
    private RecyclerView recyclerImages;
    private RecylerAdapterImage recyclerAdapterImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        // Hide the action bar
        getSupportActionBar().hide();

        // Set the status bar color
        getWindow().setStatusBarColor(Color.parseColor("#C80303"));

        // Initialize views
        arrowBack = findViewById(R.id.btn_back);
        recyclerImages = findViewById(R.id.Recy_images);

        // Set onClickListener for the back button
        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        // Initialize the adapter
        recyclerAdapterImage = new RecylerAdapterImage(getApplicationContext());

        // Set layout manager and adapter for the RecyclerView
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerImages.setLayoutManager(layoutManager);
        recyclerImages.setAdapter(recyclerAdapterImage);
    }
}
