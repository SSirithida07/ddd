package com.example.electroniccal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.buttonQ);
        bt2 = findViewById(R.id.buttonG );
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent activity2 = new Intent(getApplicationContext(), Activity2 .class);
                startActivity(activity2);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent activity2 = new Intent(getApplicationContext(), Activity2 .class);
                startActivity(activity2);
            }
        });

    }
}