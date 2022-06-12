package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class warn_katulampa extends AppCompatActivity {
    private EditText warning_message;
    private Button warnbut;
    private String warning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warn_katulampa);
        warning_message = findViewById(R.id.warning_message);
        warnbut = findViewById(R.id.warnbut);

        warnbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFullWarn = warning_message.getText().toString();

                Intent intent = new Intent(warn_katulampa.this, data_katulampa.class);
                intent.putExtra("STATUS",strFullWarn);
                startActivity(intent);
            }
        });
}
}