package com.example.intens;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnExplicit1).setOnClickListener(this);
        findViewById(R.id.btnExplicit2).setOnClickListener(this);
        findViewById(R.id.btnExplicit3).setOnClickListener(this);
        findViewById(R.id.btnExplicit4).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}