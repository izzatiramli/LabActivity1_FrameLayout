package com.example.labactivity1framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout setFrameLayout;

        setFrameLayout = findViewById(R.id.frame_Layout);
        setFrameLayout.setBackgroundColor(getResources().getColor(R.color.purple_200));
    }
}