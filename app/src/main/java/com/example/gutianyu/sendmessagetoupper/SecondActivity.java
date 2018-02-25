package com.example.gutianyu.sendmessagetoupper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by gutianyu on 2018/2/25.
 */

public class SecondActivity    extends AppCompatActivity{
    protected void  onCreate(Bundle  savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button  button2=(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent();
                intent.putExtra("data_return","Hello  FirstActivity");
                setResult(RESULT_OK,intent);
                //setResult第一个参数用于向上一个活动返回处理结果，一般只用RESULT_OK或RESULT_CANCELED
                //第二个参数把带有数据的Intent传递回去，然后调用finish方法销毁当前活动
                finish();
            }
        });
    }
}
