package com.example.ecomm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.logging.LogRecord;

public class DashbordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.parseColor("#C80303"));

        //Navigation BAr
        getWindow().setNavigationBarColor(Color.parseColor("#C80303"));


        LoadFragment(new HomeFragment());

        findViewById(R.id.Home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new HomeFragment());
                Log.e("TAG", "onClick: Home" );

            }
        });

        //Categories
        findViewById(R.id.categories_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new ShopFragment());
                Log.e("TAG", "onClick: categories_icon" );
            }
        });

        //Account
        findViewById(R.id.Account_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new ProfileFragment());
                Log.e("TAG", "onClick: Account_icon" );
            }
        });


        //Shopping Cart Fragment

        findViewById(R.id.card_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new CardFragment());
                Log.e("TAG", "onClick: card_icon" );
            }
        });



        //Notification


        findViewById(R.id.Notification_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new AcountFragment());
                Log.e("TAG", "onClick: Notification_icon" );
            }
        });

    }

        //loadfragement method
        public void LoadFragment(Fragment fragment){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

    }
}