package com.example.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b;
EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = this.<Button>findViewById(R.id.button);
        e = findViewById(R.id.editTextTextPersonName);

        b.setOnClickListener(view -> {
            String s = e.getText().toString();
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("editTextTextPersonName", s);
            startActivity(i);
        });
    }
}
