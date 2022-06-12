package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class warn_is extends AppCompatActivity {
    private EditText warning_message5;
    private Button warnbut5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warn_is);

        warning_message5 = findViewById(R.id.warning_message5);
        warnbut5 = findViewById(R.id.warnbut5);

        warnbut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFullWarn = warning_message5.getText().toString();

                Intent intent = new Intent(warn_is.this, data_istiqlal.class);
                intent.putExtra("STATUS",strFullWarn);
                startActivity(intent);
            }
        });
    }
}