package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class warn_mrn extends AppCompatActivity {
    private EditText warning_message8;
    private Button warnbut8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warn_mrn);

        warning_message8 = findViewById(R.id.warning_message8);
        warnbut8 = findViewById(R.id.warnbut8);

        warnbut8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFullWarn = warning_message8.getText().toString();

                Intent intent = new Intent(warn_mrn.this, data_mrn.class);
                intent.putExtra("STATUS",strFullWarn);
                startActivity(intent);
            }
        });
    }
}