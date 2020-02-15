package com.yagya.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class OutputActivity extends AppCompatActivity {
private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        Bundle extra = getIntent().getExtras();
        tvResult =findViewById(R.id.tvResult);
        if (!extra.isEmpty()){
            Float result = extra.getFloat("result");
            tvResult.setText(result + "");

        }else{
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }
}
