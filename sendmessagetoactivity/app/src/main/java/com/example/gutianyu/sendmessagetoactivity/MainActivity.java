package com.example.gutianyu.sendmessagetoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String   data="Hello  SecondActivity";
                Intent   intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("extra_data",data);
                //l通过putExtra方法传递了一个字符
                startActivity(intent);
                Log.d("SecondActivity","M");
            }
        });
    }
}
