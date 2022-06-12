package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class warn_dpk extends AppCompatActivity {
    private EditText warning_message2;
    private Button warnbut2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warn_dpk);

        warning_message2 = findViewById(R.id.warning_message2);
        warnbut2 = findViewById(R.id.warnbut2);

        warnbut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFullWarn = warning_message2.getText().toString();

                Intent intent = new Intent(warn_dpk.this, data_posdepok.class);
                intent.putExtra("STATUS",strFullWarn);
                startActivity(intent);
            }
        });
    }
}