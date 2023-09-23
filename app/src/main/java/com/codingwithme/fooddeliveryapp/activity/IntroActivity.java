package com.codingwithme.fooddeliveryapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.codingwithme.fooddeliveryapp.R;

public class IntroActivity extends AppCompatActivity implements View.OnClickListener {
    private ConstraintLayout btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent;

        if (view.getId() == R.id.btnStart) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}