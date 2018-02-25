package com.example.gutianyu.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String  TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null)
        {
            String  tempData=savedInstanceState.getString("data_key");
            Log.d(TAG,tempData);
        }
        Button  startDialogActivity=(Button)findViewById(R.id.start_dialog_activity);
        Button  startNormalActivity=(Button)findViewById(R.id.start_normal_activity);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });
        startDialogActivity.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View  v){
                Intent  intent=new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });
    }
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"onStart");
    }
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"onResume");
    }
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onPause");
    }
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("TAG","onRestart");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String  tempData="Something  you  just  typed";
        outState.putString("data_key",tempData);
    }
}
