package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class data_fls extends AppCompatActivity {
    TextView res_k4;
    ImageView home_fls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_fls);

        home_fls= findViewById(R.id.home_fls);
        res_k4 = findViewById(R.id.res_k4);

        Intent intent = getIntent();
        String warning = intent.getStringExtra("STATUS");

        res_k4.setText(warning);

        home_fls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(data_fls.this,home_screen.class);
                startActivity(intent);
            }
        });
    }
}