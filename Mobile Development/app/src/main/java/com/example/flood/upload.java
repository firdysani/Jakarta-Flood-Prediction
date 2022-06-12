package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import app.ij.mlwithtensorflowlite.klasifi;

public class upload extends AppCompatActivity {
    ImageView logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        logout = findViewById(R.id.logout);
        View upkatu = findViewById(R.id.upkatu);
        View updpk = findViewById(R.id.updpk);
        View upmang = findViewById(R.id.upmang);
        View upis = findViewById(R.id.upis);
        View upjm = findViewById(R.id.upjm);
        View upflush = findViewById(R.id.upflush);
        View upmar = findViewById(R.id.upmar);
        View warn = findViewById(R.id.warn);

        //logout
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upload.this,staff_login.class);
                startActivity(intent);
            }
        });

        //warn
        warn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upload.this,warn_home.class);
                startActivity(intent);
            }
        });
        //membuka kamera machine learning
        upkatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upload.this,klasifi.class);
                startActivity(intent);
            }
        });

        updpk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upload.this,klasifi.class);
                startActivity(intent);
            }
        });

        upmang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upload.this,klasifi.class);
                startActivity(intent);
            }
        });

        upis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upload.this,klasifi.class);
                startActivity(intent);
            }
        });

        upjm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upload.this,klasifi.class);
                startActivity(intent);
            }
        });

        upflush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upload.this,klasifi.class);
                startActivity(intent);
            }
        });

        upmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upload.this,klasifi.class);
                startActivity(intent);
            }
        });
    }
}