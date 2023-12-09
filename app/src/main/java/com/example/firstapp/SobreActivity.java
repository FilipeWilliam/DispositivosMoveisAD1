package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SobreActivity extends AppCompatActivity {
    private Integer counter;
    private TextView textCounter;
    private Button buttonBackMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_sobre);
        this.buttonBackMain =  findViewById(R.id.buttonBackMain);
        this.counter = intent.getIntExtra("counter", 0);
        textCounter = findViewById(R.id.txtCounter);
        textCounter.setText(String.valueOf(this.counter));
    }

    public void navigateToMain(View view) {
        onBackPressed();
    }
}