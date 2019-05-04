package com.example.student7.myovn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyOwn extends AppCompatActivity {

    private Button bt;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_own);
        bt=(Button)findViewById(R.id.but);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                bt.setText(Integer.toString(i));
            }
        });
    }
}