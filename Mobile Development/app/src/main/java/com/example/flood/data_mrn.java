package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class data_mrn extends AppCompatActivity {
    TextView res_k7;
    ImageView home_mrn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mrn);

        home_mrn= findViewById(R.id.home_mrn);
        res_k7 = findViewById(R.id.res_k7);

        Intent intent = getIntent();
        String warning = intent.getStringExtra("STATUS");

        res_k7.setText(warning);

        home_mrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(data_mrn.this,home_screen.class);
                startActivity(intent);
            }
        });
    }
}