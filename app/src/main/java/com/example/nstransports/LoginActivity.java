package com.example.nstransports;

import androidx.appcompat.app.AppCompatActivity;
import com.example.nstransports.DBConnection;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
    public void goBack(View v){
        Intent back_intent = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(back_intent);
    }
    public void gotoRegister(View v){
        Intent register_intent = new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(register_intent);
    }
//    public void gotoForgotPassword(View v){
//        Intent fgpwd_intent = new Intent(LoginActivity.this,ForgotPasswordActivity.class);
//        startActivity(fgpwd_intent);
//    }


    public void login(View v){
        EditText username = (EditText) findViewById(R.id.username);
        String u_name = username.getText().toString();
        EditText p_word = (EditText) findViewById(R.id.password);
        String pwd = p_word.getText().toString();
        String email = DBConnection.getValue(this,"email");
        String password = DBConnection.getValue(this,"password");




        if((u_name.equals(email))&&(pwd.equals(password))){

            Intent home_intent = new Intent(LoginActivity.this,SearchActivity.class);
            startActivity(home_intent);
        }


    }

}