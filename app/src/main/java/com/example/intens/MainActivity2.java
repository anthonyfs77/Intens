package com.example.intens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.btnExplicit1).setOnClickListener(this);
        findViewById(R.id.btnExplicit2).setOnClickListener(this);
        findViewById(R.id.btnExplicit3).setOnClickListener(this);
        findViewById(R.id.btnExplicit4).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        int id = view.getId();

        if (id == R.id.btnExplicit1) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
            startActivity(intent);
        } else if (id == R.id.btnExplicit2) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
            startActivity(intent);
        } else if (id == R.id.btnExplicit3) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
            startActivity(intent);
        } else if (id == R.id.btnExplicit4) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
            startActivity(intent);
        }
    }
}
