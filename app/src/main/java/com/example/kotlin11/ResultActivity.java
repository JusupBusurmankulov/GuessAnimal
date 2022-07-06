package com.example.kotlin11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView getIntent;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getIntent = findViewById(R.id.tv_result);
        result = getIntent().getStringExtra("key");
        getIntent.setText(result);
    }
}