package com.rajendra.Tishaonlinegroceries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddToCart extends AppCompatActivity {

    private Button move6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);

        move6 = findViewById(R.id.keepshopping);
        move6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddToCart.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}