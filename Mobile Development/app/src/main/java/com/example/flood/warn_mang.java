package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class warn_mang extends AppCompatActivity {
    private EditText warning_message3;
    private Button warnbut3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warn_mang);

        warning_message3 = findViewById(R.id.warning_message3);
        warnbut3 = findViewById(R.id.warnbut3);

        warnbut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFullWarn = warning_message3.getText().toString();

                Intent intent = new Intent(warn_mang.this, data_manggarai.class);
                intent.putExtra("STATUS",strFullWarn);
                startActivity(intent);
            }
        });
    }
}