package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edHeight,edWidth;
    private float height,weight;
    private TextView tv_bmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edHeight = findViewById(R.id.ed_Height);
        edWidth = findViewById(R.id.ed_Weight);
        tv_bmi = findViewById(R.id.tv_bmi);
    }

    public void btnClick(View view) {
        height =  Float.valueOf(edHeight.getText().toString())/100;
        weight = Float.valueOf(edWidth.getText().toString());
        float bmi = weight/(height*height);
        tv_bmi.setText(String.valueOf(bmi));

    }
}