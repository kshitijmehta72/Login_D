package com.example.ayush.login_b058;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    Button b3;
    EditText ed3,ed4,ed5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void signup(View v)
    {

        ed3=(EditText)findViewById(R.id.editText3);
        ed4=(EditText)findViewById(R.id.editText4);
        ed5=(EditText)findViewById(R.id.editText5);
        b3=(Button)findViewById(R.id.button3);
        Intent int3=new Intent("com.example.ayush.login_b058.Main3Activity");
        startActivity(int3);


    }

}
