package com.example.nstransports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public void interchange(View v){
        EditText source = (EditText) findViewById(R.id.source);
        EditText destination = (EditText) findViewById(R.id.destination);
        String s_text = source.getText().toString();
        String d_text = destination.getText().toString();
        source.setText(d_text);
        destination.setText(s_text);
    }

    public void search(View v){
        EditText source = (EditText) findViewById(R.id.source);
        EditText destination = (EditText) findViewById(R.id.destination);
        String s_text = source.getText().toString();
        String d_text = destination.getText().toString();
        DBConnection.setValue(this,"source",s_text);
        DBConnection.setValue(this,"destination",d_text);
        Intent searchbuses = new Intent(SearchActivity.this,BusesActivity.class);
        startActivity(searchbuses);
    }
}