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