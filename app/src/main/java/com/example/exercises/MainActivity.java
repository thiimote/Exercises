package com.example.exercises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText  username , password;
    private Button register, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.user);
        password = (EditText)findViewById(R.id.pass);
        register = (Button)findViewById(R.id.registerbutton);
        login = (Button)findViewById(R.id.loginbutton);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent registerinten = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(registerinten);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String user = username.getText().toString();
                String pass = password.getText().toString();


                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                {
                    Toast.makeText(MainActivity.this, "some field is empty", Toast.LENGTH_SHORT).show();
                }
                if (user.equals("admin") && pass.equals("12345"))
                {
                    Toast.makeText(MainActivity.this, "successsful logged in", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
