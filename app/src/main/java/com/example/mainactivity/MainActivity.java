package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button pluszgomb;
    private Button minuszgomb;
    private TextView text;
    public int a = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pluszgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                text.setText(a);
                if (a > 0) {
                    text.setTextColor(getColor(R.color.green));
                }
                else if (a == 0) {
                    text.setTextColor(getColor(R.color.blue));
                }





            }
        });

        minuszgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a--;
                text.setText(a);
                if (a < 0) {
                    text.setTextColor(getColor(R.color.red));
                }
                else if (a == 0) {
                    text.setTextColor(getColor(R.color.blue));
                }


            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = 0;
                text.setText(a);
                text.setTextColor(getColor(R.color.blue));

            }
        });



        init();
    }




    public void init(){
        pluszgomb = findViewById(R.id.pluszgomb);
        minuszgomb = findViewById(R.id.minuszgomb);
        text = findViewById(R.id.text);

    }
}