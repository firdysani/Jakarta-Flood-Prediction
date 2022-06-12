package com.example.flood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class staff_login extends AppCompatActivity {
    ImageView back_staff;
    private Button login_staff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_login);

        back_staff = findViewById(R.id.back_staff);
        login_staff = findViewById(R.id.login_staff);

        back_staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(staff_login.this,home_screen.class);
                startActivity(intent);
            }
        });

        login_staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(staff_login.this,upload.class);
                startActivity(intent);
            }
        });

    }
}
