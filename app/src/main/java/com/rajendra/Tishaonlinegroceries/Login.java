package com.rajendra.Tishaonlinegroceries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button move1;
    private Button move2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView userName = (EditText) findViewById(R.id.username);
        final TextView pass = (EditText) findViewById(R.id.password);

        Button button = (Button) findViewById(R.id.loginBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userName.getText().toString().equals("Tisha") && pass.getText().toString().equals("tishaxx")){
                    Toast.makeText(Login.this, "Login Successful ", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Login.this, "Login Unsuccessful..Invalid Username or Password!!", Toast.LENGTH_SHORT).show();
                }

                 }
        });
        move1=findViewById(R.id.signBtn);
        move1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Registration.class);
                startActivity(intent);
            }
        });

        move2=findViewById(R.id.loginBtn);
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}