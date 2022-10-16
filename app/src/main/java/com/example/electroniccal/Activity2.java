package com.example.electroniccal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    Button btb,btW,btA,btV,btO,btF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btb = findViewById(R.id.buttonB);
        btV  = findViewById(R.id.buttonV);
        btW = findViewById(R.id.buttonW);
        btA  = findViewById(R.id.buttonA);
        btO  = findViewById(R.id.buttonO);
        btF  = findViewById(R.id.buttonF );

        btb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Activity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Activity);

            }
        });
        btV.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Activity3 = new Intent(getApplicationContext(), Activity3.class);
                startActivity(Activity3);

            }
        });
        btW.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Activity3 = new Intent(getApplicationContext(), Activity3.class);
                startActivity(Activity3);

            }
        });
        btA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Activity3 = new Intent(getApplicationContext(), Activity3.class);
                startActivity(Activity3);

            }
        });
        btO.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Activity3 = new Intent(getApplicationContext(), Activity3.class);
                startActivity(Activity3);

            }
        });
        btF.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Activity3 = new Intent(getApplicationContext(), Activity3.class);
                startActivity(Activity3);

            }
        });

    }
}