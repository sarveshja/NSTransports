package com.example.nstransports;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = (Button) findViewById(R.id.login);
        Button register = (Button) findViewById(R.id.register);
        login.setOnClickListener(v ->{
            Intent login_intent = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(login_intent);
        });
        register.setOnClickListener(v ->{
            Intent register_intent = new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(register_intent);
        });
    }
}