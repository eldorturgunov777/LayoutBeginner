package com.example.layoutbeginner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThreeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_detail);
        TextView textView = findViewById(R.id.userid);
        TextView textView2 = findViewById(R.id.password);

        Intent intent = getIntent();

        String login = intent.getStringExtra("name");
        String password = intent.getStringExtra("pass");

        textView.setText(login);
        textView2.setText(password);

    }
}