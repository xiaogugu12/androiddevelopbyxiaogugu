package com.example.gutianyu.sendmessagetoupper;

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
        Button  button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent   intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //requestCode启动活动的请求码，resultCode返回数据传入的处理结果
        //data返回数据的Intent
        switch (requestCode)
        {
            case  1:
                if(resultCode==RESULT_OK){
                    String  returnedDate=data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedDate);
                }
                break;
        }
    }
}
