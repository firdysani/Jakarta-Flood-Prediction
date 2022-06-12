package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class data_katulampa extends AppCompatActivity {
    public static final String WARNING = "WARNING";
    TextView res_k;
    ImageView home_katu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_katulampa);

        home_katu= findViewById(R.id.home_katu);
        res_k = findViewById(R.id.res_k);

        Intent intent = getIntent();
        String warning = intent.getStringExtra("STATUS");

        res_k.setText(warning);

        home_katu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(data_katulampa.this,home_screen.class);
                startActivity(intent);
            }
        });
    }
}