package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class warn_jm extends AppCompatActivity {
    private EditText warning_message6;
    private Button warnbut7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warn_jm);

        warning_message6 = findViewById(R.id.warning_message6);
        warnbut7 = findViewById(R.id.warnbut7);

        warnbut7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFullWarn = warning_message6.getText().toString();

                Intent intent = new Intent(warn_jm.this, data_jm.class);
                intent.putExtra("STATUS",strFullWarn);
                startActivity(intent);
            }
        });
    }
}