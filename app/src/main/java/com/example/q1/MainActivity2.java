package com.example.q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button myButton = findViewById(R.id.button4);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                Toast.makeText(MainActivity2.this, "Landing Page", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }

        });
    }
}