package com.example.layoutbeginner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void task1(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void task2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void task3(View view) {
        Intent intent = new Intent(this, ThreeActivity.class);
        startActivity(intent);
    }

    public void task4(View view) {
        Intent intent = new Intent(this, FourActivity.class);
        startActivity(intent);
    }
}