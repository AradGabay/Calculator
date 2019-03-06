package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    String st1;
    Double as;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = (EditText)findViewById(R.id.edt);
        as=0.0;


    }

    public void activity(View view) {
        Intent in = new Intent(this,Main2Activity.class);
        in.putExtra("a",as);
        startActivity(in);

    }

    public void divide(View view) {
        st1 = edt.getText().toString();
        if(!st1.matches("")) {
            as = as / Double.parseDouble(st1);
            edt.setText("");
        }
    }

    public void add(View view) {
            st1 = edt.getText().toString();
            if(!st1.matches("")) {
                as = as + Double.parseDouble(st1);
                edt.setText("");
            }

    }

    public void subt(View view) {
            st1 = edt.getText().toString();
            if(!st1.matches("")) {
                as = as - Double.parseDouble(st1);
                edt.setText("");
            }

    }

    public void multip(View view) {
            st1 = edt.getText().toString();
                if(!st1.matches("")) {
                    as = as * Double.parseDouble(st1);
                    edt.setText("");
                }
    }

    public void clear(View view) {
        edt.setText("");
        as=0.0;
    }

    public void getanswer(View view) {
        edt.setText(as.toString());
    }
}
