package com.example.gutianyu.broadcastdecidebyyouself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private  IntentFilter  intentFilter;
    private  LocalReceiver  localReceiver;
    private  LocalBroadcastManager  localBroadcastManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    class  LocalReceiver  extends  BroadcastReceiver
    {

    }
}
