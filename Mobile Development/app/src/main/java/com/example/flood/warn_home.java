package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class warn_home extends AppCompatActivity {
    ImageView warn_k, warn_p, warn_m, warn_i, warn_jm, warn_f, warn_mrn, returnwarn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warn_home);

        returnwarn = findViewById(R.id.returnwarn);
        warn_k = findViewById(R.id.warn_k);
        warn_p = findViewById(R.id.warn_p);
        warn_m = findViewById(R.id.warn_m);
        warn_i = findViewById(R.id.warn_i);
        warn_jm = findViewById(R.id.warn_jm);
        warn_f = findViewById(R.id.warn_f);
        warn_mrn = findViewById(R.id.warn_mrn);

        returnwarn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(warn_home.this,upload.class);
                startActivity(intent);
            }
        });
        warn_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(warn_home.this,warn_katulampa.class);
                startActivity(intent);
            }
        });
        warn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(warn_home.this,warn_dpk.class);
                startActivity(intent);
            }
        });
        warn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(warn_home.this,warn_mang.class);
                startActivity(intent);
            }
        });
        warn_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(warn_home.this,warn_is.class);
                startActivity(intent);
            }
        });
        warn_jm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(warn_home.this,warn_jm.class);
                startActivity(intent);
            }
        });
        warn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(warn_home.this,warn_fls.class);
                startActivity(intent);
            }
        });
        warn_mrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(warn_home.this,warn_mrn.class);
                startActivity(intent);
            }
        });
    }
}