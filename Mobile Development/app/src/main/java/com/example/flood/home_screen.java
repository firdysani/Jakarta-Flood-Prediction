package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class home_screen extends AppCompatActivity {
    ImageView login, katulampa, pos_depok, manggarai, istiqlal, jemmer, fls_ancl, mrn_ancl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        login = findViewById(R.id.login);
        katulampa = findViewById(R.id.katulampa);
        pos_depok = findViewById(R.id.pos_depok);
        manggarai = findViewById(R.id.manggarai);
        istiqlal = findViewById(R.id.istiqlal);
        jemmer = findViewById(R.id.jemmer);
        fls_ancl = findViewById(R.id.fls_ancl);
        mrn_ancl = findViewById(R.id.mrn_ancl);

        //login

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this,staff_login.class);
                startActivity(intent);
            }
        });

        //akses ke data

        katulampa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this,data_katulampa.class);
                startActivity(intent);
            }
        });
        pos_depok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this,data_posdepok.class);
                startActivity(intent);
            }
        });
        istiqlal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this,data_istiqlal.class);
                startActivity(intent);
            }
        });
        manggarai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this,data_manggarai.class);
                startActivity(intent);
            }
        });
        jemmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this,data_jm.class);
                startActivity(intent);
            }
        });
        fls_ancl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this,data_fls.class);
                startActivity(intent);
            }
        });
        mrn_ancl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_screen.this,data_mrn.class);
                startActivity(intent);
            }
        });
    }
}