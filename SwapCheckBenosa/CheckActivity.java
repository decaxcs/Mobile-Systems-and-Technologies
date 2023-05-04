package com.example.swapcheckbenosa;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CheckActivity extends AppCompatActivity {

    private TextView tvCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        tvCheck = findViewById(R.id.tvCheck);

        Intent intent = getIntent();
        String result = intent.getStringExtra("result");

        String message = result;

        tvCheck.setText(message);
    }
}