package com.example.layoutbeginner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThreeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

    }

    public void logIn(View view) {
        EditText email = findViewById(R.id.email);
        EditText pass = findViewById(R.id.pass);
        String name = email.getText().toString();
        String password = pass.getText().toString();

        Intent intent = new Intent(ThreeActivity.this, ThreeDetailActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("pass", password);
        startActivity(intent);
    }
}