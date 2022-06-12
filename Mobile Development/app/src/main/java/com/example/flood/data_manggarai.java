package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class data_manggarai extends AppCompatActivity {
    TextView res_k3;
    ImageView home_mg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_manggarai);

        home_mg= findViewById(R.id.home_mg);
        res_k3 = findViewById(R.id.res_k3);

        Intent intent = getIntent();
        String warning = intent.getStringExtra("STATUS");

        res_k3.setText(warning);

        home_mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(data_manggarai.this,home_screen.class);
                startActivity(intent);
            }
        });
    }
}