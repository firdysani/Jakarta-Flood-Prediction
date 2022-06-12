package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class data_jm extends AppCompatActivity {
    TextView res_k6;
    ImageView home_jm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_jm);

        home_jm= findViewById(R.id.home_jm);
        res_k6 = findViewById(R.id.res_k6);

        Intent intent = getIntent();
        String warning = intent.getStringExtra("STATUS");

        res_k6.setText(warning);

        home_jm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(data_jm.this,home_screen.class);
                startActivity(intent);
            }
        });
    }
}