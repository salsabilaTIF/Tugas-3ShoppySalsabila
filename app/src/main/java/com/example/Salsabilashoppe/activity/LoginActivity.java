package com.example.Salsabilashoppe.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Salsabilashoppe.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username,password;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_relative);

        login = (Button) findViewById(R.id.btnmasuk);
        username = (EditText) findViewById(R.id.etusername);
        password = (EditText) findViewById(R.id.etpasword);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText().toString().toUpperCase().equals("TEST1"))
                {
                 login_suskes();
                }else {
                    Toast.makeText(getApplicationContext(),"Salah Password", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void login_suskes() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        //Kirimkan usernamenya ketampilan utama
        i.putExtra("USERNAME",user_login);
        startActivity(i);

    }
}
