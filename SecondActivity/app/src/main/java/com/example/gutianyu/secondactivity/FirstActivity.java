package com.example.gutianyu.secondactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    protected void  onCreate(Bundle  savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  button1=(Button)findViewById(R.id.button_2);
        button1.setOnClickListener(new  View.OnClickListener(){
            public void  onClick(View  v){
               Intent  intent=new Intent(FirstActivity.this,SecondActivity.class);
               startActivity(intent);//在FirstActivity活动的基础上打开SecondActivity
                //这个活动，然后通过startActivity方法执行这个Intent
            }
        });
    }
}
