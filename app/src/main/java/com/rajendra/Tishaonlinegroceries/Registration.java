package com.rajendra.Tishaonlinegroceries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    private Button move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);



        final EditText firstname = (EditText) findViewById(R.id.firstname);

        Button button = (Button) findViewById(R.id.registerBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname1 = firstname.getText().toString();
                Toast.makeText(Registration.this, "You have been Successfully Registered!!! ", Toast.LENGTH_SHORT).show();
            }
        });
        move=findViewById(R.id.registerBtn);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registration.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


}