package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtl;
    Double x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent g1 = getIntent();
         x1 = g1.getDoubleExtra("a",0.0);
        String st=x1.toString();
        txtl=(TextView)findViewById(R.id.txt);
        txtl.setText(st);

    }


    public void backact(View view) {
        Intent t2= new Intent(this,MainActivity.class);
        startActivity(t2);

    }
}
