package com.example.swapcheckbenosa;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstWord;
    private EditText etSecondWord;
    private Button btnSwap;
    private Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstWord = findViewById(R.id.etFirstWord);
        etSecondWord = findViewById(R.id.etSecondWord);
        btnSwap = findViewById(R.id.btnSwap);
        btnCheck = findViewById(R.id.btnCheck);

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = etFirstWord.getText().toString();
                etFirstWord.setText(etSecondWord.getText().toString());
                etSecondWord.setText(temp);
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstWord = etFirstWord.getText().toString();
                String secondWord = etSecondWord.getText().toString();

                Intent intent = new Intent(MainActivity.this, CheckActivity.class);
                if (firstWord.equals(secondWord)) {
                    intent.putExtra("result", "THE SAME");
                } else {
                    intent.putExtra("result", "NOT THE SAME");
                }
                startActivity(intent);
            }
        });
    }
}