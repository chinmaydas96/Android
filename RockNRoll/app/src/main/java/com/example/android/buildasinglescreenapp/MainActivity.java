package com.example.android.buildasinglescreenapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.name);
        Typeface face= Typeface.createFromAsset(getAssets(), "font/futuroNormal.ttf");
        tv.setTypeface(face);
    }
}
