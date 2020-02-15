package com.yagya.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etFirst, etSecond;
    private Button btnSum, btnSubtract, btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);
        btnSum = findViewById(R.id.btnSum);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide = findViewById(R.id.btnDivide);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();

            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        }
    private void Add() {
        float first = Float.parseFloat(etFirst.getText().toString());
        float second = Float.parseFloat(etSecond.getText().toString());
        Arithmetic arithmetic = new Arithmetic();
        float result = arithmetic.add(first, second);

        Intent intent = new Intent(MainActivity.this, OutputActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
    }
