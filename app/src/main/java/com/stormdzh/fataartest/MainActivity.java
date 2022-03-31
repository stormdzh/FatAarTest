package com.stormdzh.fataartest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.stormdzh.library_all.ui.AllTest01Activity;
import com.stormdzh.library_one.ui.OneTest01Activity;
import com.stormdzh.library_two.TwoTest01Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.tvTest01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OneTest01Activity.class));
            }
        });

        findViewById(R.id.tvTest02).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TwoTest01Activity.class));
            }
        });

        findViewById(R.id.tvTest03).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AllTest01Activity.class));
            }
        });

    }
}