package com.rajendra.Tishaonlinegroceries;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuyNow extends AppCompatActivity {

    private Button move4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_now);

        move4 = findViewById(R.id.buyproduct);
        move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuyNow.this, Confirm.class);
                startActivity(intent);
            }
        });
    }

}