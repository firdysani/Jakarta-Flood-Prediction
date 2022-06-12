package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class data_posdepok extends AppCompatActivity {
    TextView res_k2;
    ImageView home_dpk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_posdepok);

        home_dpk= findViewById(R.id.home_dpk);
        res_k2 = findViewById(R.id.res_k2);

        Intent intent = getIntent();
        String warning = intent.getStringExtra("STATUS");

        res_k2.setText(warning);

        home_dpk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(data_posdepok.this,home_screen.class);
                startActivity(intent);
            }
        });
    }
}