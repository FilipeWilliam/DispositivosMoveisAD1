package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    private TextView textCounter;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textCounter = findViewById(R.id.textCounter);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonAbout = findViewById(R.id.buttonAbout);
        textCounter.setText(String.valueOf(this.getCounter()));
    }

    private Integer getCounter() {
        return this.counter;
    }

    public void navigateToAbout(View view) {
        Intent i = new Intent(MainActivity.this, SobreActivity.class);
        i.putExtra("counter", this.counter);
        startActivity(i);
    }

    public void navigateToCamera(View view) {
        Intent i = new Intent(MainActivity.this, CamActivity.class);
        startActivity(i);
    }

    public void add(View view) {
        this.counter++;
        textCounter.setText(String.valueOf(this.getCounter()));
    }

    public void remove(View view) {
        this.counter--;
        textCounter.setText(String.valueOf(this.getCounter()));
    }
}