package com.example.nstransports;

import com.example.nstransports.DBConnection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void goBack(View v){
        Intent back_intent = new Intent(RegisterActivity.this,MainActivity.class);
        startActivity(back_intent);
    }

    public void signUp(View v){
        EditText name = (EditText) findViewById(R.id.name);
        EditText p_no = (EditText) findViewById(R.id.p_no);
        EditText email = (EditText) findViewById(R.id.email);
        EditText p_word = (EditText) findViewById(R.id.password);
        EditText c_p_word= (EditText) findViewById(R.id.c_password);
        EditText dob = (EditText) findViewById(R.id.dob);
        EditText age = (EditText) findViewById(R.id.age);
        RadioGroup rg_gen = (RadioGroup) findViewById(R.id.gender);
        int selected_gen_id = rg_gen.getCheckedRadioButtonId();
        RadioButton gen = (RadioButton) findViewById(selected_gen_id);
        if((name.getText().toString() == "")||(p_no.getText().toString() == "")||(email.getText().toString() == "")||(p_word.getText().toString() == "")||(c_p_word.getText().toString() == "")||(dob.getText().toString() == "")||(age.getText().toString() == "")){
            Toast.makeText(getApplicationContext(),"Fill all the fields", Toast.LENGTH_SHORT).show();
        }
        else if((p_no.getText().toString().length()<10)||(p_no.getText().toString().length()>10)){
            Toast.makeText(getApplicationContext(),"Phone number must contain 10 characters exactly", Toast.LENGTH_SHORT).show();
        }
        else if(p_word.getText().toString() == c_p_word.getText().toString()){
            Toast.makeText(getApplicationContext(),"Password and confirm password are different", Toast.LENGTH_SHORT).show();
        }
        else{
            DBConnection.setValue(this,"email",email.getText().toString());
            DBConnection.setValue(this,"password",p_word.getText().toString());
            Toast.makeText(this,"Register Successfully",Toast.LENGTH_SHORT).show();
            Intent login = new Intent(RegisterActivity.this,LoginActivity.class);
            startActivity(login);
        }
    }


}