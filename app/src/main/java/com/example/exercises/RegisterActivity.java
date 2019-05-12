package com.example.exercises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText firstname , lastname , username , password;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstname = (EditText)findViewById(R.id.firtsname);
        lastname = (EditText)findViewById(R.id.lastname);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.pass);
        register = (Button)findViewById(R.id.registerbutton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                String first = firstname.getText().toString();
                String last = lastname.getText().toString();
                String user = username.getText().toString();
                String pass = password.getText().toString();


                if (TextUtils.isEmpty(first) || TextUtils.isEmpty(last)
                || TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                {
                    Toast.makeText(RegisterActivity.this, "some field is empty", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(RegisterActivity.this, "registration successful", Toast.LENGTH_SHORT).show();
                    Intent loginintent = new Intent(RegisterActivity.this,MainActivity.class);
                    startActivity(loginintent);
                }




            }
        });


    }
}
