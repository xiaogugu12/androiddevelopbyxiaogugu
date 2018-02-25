package com.example.gutianyu.activitytoupper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by gutianyu on 2018/2/25.
 */

public class Second_Activity  extends AppCompatActivity {
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
                finish();
            }
            public void  onBackPressed(){
                //此方法解决用户按下back键回到FirstActivity
                Intent  intent=new Intent();
                intent.putExtra("data_return","Hello FirstActivity");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
