package com.example.ayush.login_b058;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void login(View v)
    {
        b1=(Button)findViewById(R.id.button);

        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);
        String s1=ed1.getText().toString();
        String s2=ed2.getText().toString();
        if(s1.equals("kshitij") && s2.equals("9820312107"))
        {
            Intent int1=new Intent("com.example.ayush.login_b058.Main3Activity");
            startActivity(int1);
            Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();




        }
        else
        {
            Toast.makeText(MainActivity.this,"Invalid Password",Toast.LENGTH_SHORT).show();
            ed1.setText("");
            ed2.setText("");
            return;

        }
    }
    public void signups(View v)
    {
        b2=(Button)findViewById(R.id.button2);
        Intent int2=new Intent("com.example.ayush.login_b058.Main2Activity");
        startActivity(int2);
    }


}
