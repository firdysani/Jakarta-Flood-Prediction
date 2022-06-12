package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class warn_fls extends AppCompatActivity {
    private EditText warning_message4;
    private Button warnbut4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warn_fls);

        warning_message4 = findViewById(R.id.warning_message4);
        warnbut4 = findViewById(R.id.warnbut4);

        warnbut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFullWarn = warning_message4.getText().toString();

                Intent intent = new Intent(warn_fls.this, data_fls.class);
                intent.putExtra("STATUS",strFullWarn);
                startActivity(intent);
            }
        });
    }
}