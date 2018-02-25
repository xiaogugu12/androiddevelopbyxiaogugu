package com.example.gutianyu.sendmessagetoactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by gutianyu on 2018/2/24.
 */

public class SecondActivity   extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent   intent=getIntent();
        String   data=intent.getStringExtra("extra_data");
        //通过getString接收了一个字符
        Log.d("SecondActivity","m");
    }
}
