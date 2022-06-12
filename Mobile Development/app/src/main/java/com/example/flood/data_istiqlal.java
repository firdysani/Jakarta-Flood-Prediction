package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class data_istiqlal extends AppCompatActivity {
    TextView res_k5;
    ImageView home_is;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_istiqlal);

        home_is= findViewById(R.id.home_is);
        res_k5 = findViewById(R.id.res_k5);

        Intent intent = getIntent();
        String warning = intent.getStringExtra("STATUS");

        res_k5.setText(warning);

        home_is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(data_istiqlal.this,home_screen.class);
                startActivity(intent);
            }
        });
    }
}