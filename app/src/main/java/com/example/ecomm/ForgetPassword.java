package com.example.ecomm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetPassword extends AppCompatActivity {
  Button Createe;
  EditText OTP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        getSupportActionBar().hide();
        OTP=findViewById(R.id.OTPpaste);

        Createe = findViewById(R.id.SetPassword);
        Createe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", "OTP: "+OTP.getText().toString() );
                if(OTP.getText().toString().isEmpty()){
                    Toast.makeText(ForgetPassword.this, "OTP", Toast.LENGTH_SHORT).show();
                    return;
                }
                  else {
                      Intent intent = new Intent(ForgetPassword.this,NewPassword.class);
                      startActivity(intent);

                }
            }
        });

    }
}