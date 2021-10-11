package com.tugcearas.mixofcolors;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText color1;
    EditText color2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color1 = findViewById(R.id.TextColor1);
        color2 = findViewById(R.id.TextColor2);
        result = findViewById(R.id.ResultText);


    }


    @SuppressLint("SetTextI18n")
    public void MixColors(View view){

        if(color1.getText().toString().matches("") || color2.getText().toString().matches("")){

            result.setText("Enter a color!");

        }

        else {


            if (color1.getText().toString().matches("blue") && color2.getText().toString().matches("yellow") || color1.getText().toString().matches("yellow") && color2.getText().toString().matches("blue")) {

                result.setText("green");
                
            }

            if (color1.getText().toString().matches("yellow") && color2.getText().toString().matches("red") || color1.getText().toString().matches("red") && color2.getText().toString().matches("yellow")) {

                result.setText("orange");

            }

            if (color1.getText().toString().matches("blue") && color2.getText().toString().matches("red") || color1.getText().toString().matches("red") && color2.getText().toString().matches("blue")) {

                result.setText("purple");

            }

            if (color1.getText().toString().matches("white") && color2.getText().toString().matches("red") || color1.getText().toString().matches("red") && color2.getText().toString().matches("white")) {

                result.setText("pink");

            }
        }
    }


}