package com.example.electroniccal;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Activity3 extends AppCompatActivity {
    Button sum ,bt3;
    EditText num1,num2,num3;
    int val1,val2;
    TextView TIME;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        num1= (EditText) findViewById(R.id.TextNum1 );
        num2 = (EditText) findViewById(R.id.textNum2);
        num3 = (EditText) findViewById(R.id.textNum3);
        bt3 = findViewById(R.id.buttonB3);
        sum= findViewById(R.id.button);
        sum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Random random = new Random();
                 val1 = random.nextInt(100);
                 val2 = random.nextInt(100);
                num1.setText(Integer.toString(val1));
                num2.setText(Integer.toString(val2));
                num3.setText(Integer.toString(val1 + val2 ));
            }
        });
        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent Activity2 = new Intent(getApplicationContext(), Activity2.class);
                startActivity(Activity2);

            }
        });

               TIME  = (TextView)findViewById(R.id.TIME2 );

                new CountDownTimer( 10000, 100) {
                    public void onTick(long millisUntilFinished) {
                        TIME .setText("Time: " + millisUntilFinished / 1000);
                    }
                    public void onFinish() {
                       TIME .setText("done!");
                    }
                }.start();
            }
        }
