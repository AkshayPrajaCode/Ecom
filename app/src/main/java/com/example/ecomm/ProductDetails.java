package com.example.ecomm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ecomm.SliderImage.RecylerAdapterImage;
import com.skydoves.elasticviews.ElasticButton;

import java.util.List;

public class ProductDetails extends AppCompatActivity {

    private ElasticButton arrowBack;
    private RecyclerView recyclerImages;
    private RecylerAdapterImage recyclerAdapterImage;
    ImageView imageDetails;
    TextView product_price,product_discount,product_rating,product_stack,productDiscription,titleName,BrandNAme;

    TextView minus_decrements,number_sysmbols,plus_increments;

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
        imageDetails = findViewById(R.id.imageDetails);
        product_price= findViewById(R.id.product_price);
        product_discount= findViewById(R.id.product_discount);
        product_rating= findViewById(R.id.product_rating);
        product_stack= findViewById(R.id.product_stack);
        productDiscription= findViewById(R.id.productDiscription);
        titleName=findViewById(R.id.PtitleName);
        BrandNAme= findViewById(R.id.BrandNAme);
        minus_decrements= findViewById(R.id.minus_decrements);
        number_sysmbols= findViewById(R.id.number_sysmbols);
        plus_increments= findViewById(R.id.plus_increments);








        getIntent().getStringExtra("titleName");
        getIntent().getStringExtra("BrandName");
        getIntent().getStringExtra("price").toString();
        getIntent().getStringExtra("Stock").toString();
        getIntent().getStringExtra("Discount").toString();
        getIntent().getStringExtra("Rating").toString();
        getIntent().getStringExtra("Description");

        if(getIntent().getStringExtra("price").toString()!=null){
            product_price.setText("₹"+getIntent().getStringExtra("price").toString());
        }

        if(getIntent().getStringExtra("BrandName") !=null){
            BrandNAme.setText(getIntent().getStringExtra("BrandName"));
        }

        if(getIntent().getStringExtra("titleName") !=null){
            titleName.setText(getIntent().getStringExtra("titleName"));
        }

        if(getIntent().getStringExtra("Stock").toString()!=null){
            product_stack.setText(" Stock : "+getIntent().getStringExtra("Stock").toString());
        }

        if(getIntent().getStringExtra("Description").toString()!=null){
            productDiscription.setText("₹"+getIntent().getStringExtra("Description").toString());
        }
        if(getIntent().getStringExtra("Rating").toString()!=null){
            product_rating.setText("Rating : "+getIntent().getStringExtra("Rating").toString()+"/5");
        }


        if(getIntent().getStringExtra("Discount").toString()!=null){
            product_discount.setText(getIntent().getStringExtra("Discount").toString()+"%");
        }

        if(getIntent().getStringExtra("Thumbnail") != null)
        {
            Glide.with(getApplicationContext()).load(getIntent().getStringExtra("Thumbnail")).into(imageDetails);
        }

        List<String> Images =   (List<String>) getIntent().getSerializableExtra("imglist");


        if(Images != null)
        {
            // Initialize the adapter
            recyclerAdapterImage = new RecylerAdapterImage(getApplicationContext(),Images);
            // Set layout manager and adapter for the RecyclerView
            LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            recyclerImages.setLayoutManager(layoutManager);
            recyclerImages.setAdapter(recyclerAdapterImage);
        }


        minus_decrements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Integer.parseInt(number_sysmbols.getText().toString()) > 1)
                {
                    number_sysmbols.setText(""+(Integer.parseInt(number_sysmbols.getText().toString())-1));
                }
            }
        });


        plus_increments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(Integer.parseInt(String.valueOf(number_sysmbols)) > getIntent().getStringExtra("Stock"))) {
                    number_sysmbols.setText("" + (Integer.parseInt(number_sysmbols.getText().toString()) + 1));
                } else if (Integer.parseInt(number_sysmbols.getText().toString()) > 0) {
                    number_sysmbols.setText("" + (Integer.parseInt(number_sysmbols.getText().toString()) + 1));
                }
            }
        });






        // Set onClickListener for the back button
        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }


}
