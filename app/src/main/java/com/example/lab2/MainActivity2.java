package com.example.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent n = getIntent();
        String s = n.getStringExtra("editTextTextPersonName");
        TextView tv = findViewById(R.id.textView);
        tv.setText("Hello There Sweet"+s+"!!!");
    }
}