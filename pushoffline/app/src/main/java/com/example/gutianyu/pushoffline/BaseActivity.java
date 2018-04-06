package com.example.gutianyu.pushoffline;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by gutianyu on 2018/4/6.
 */

public class BaseActivity  extends AppCompatActivity
{
    private ForceOfflineReceiver  receiver;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }
    protected void  onResume()
    {
        super.onResume();
        Log.e("m","重新挂起活动");
        IntentFilter  intentFilter=new IntentFilter();
        intentFilter.addAction("com.example.broadcastbestpractice.FORCE_OFFLINE");

        receiver=new ForceOfflineReceiver();
        registerReceiver(receiver,intentFilter);
    }
    protected void  onPause()
    {
        Log.e("m","停止活动");
        super.onPause();
        if(receiver!=null)
        {
            unregisterReceiver(receiver);
            Log.e("m","取消注册活动");
            receiver=null;
        }
    }
    protected void onDestroy()
    {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
    class ForceOfflineReceiver  extends BroadcastReceiver
    {
        public void  onReceive(final Context  context, Intent intent)
        {
            Log.e("m","接受到广播");
            AlertDialog.Builder  builder=new AlertDialog.Builder(context);
            builder.setTitle("Warning");
            builder.setMessage("You  are  forced to be offline.Please try to login again.");
            builder.setCancelable(false);
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    ActivityCollector.finishAll();
                    //销毁所有活动
                    Intent  intent=new Intent(context,LoginActivity.class);
                    context.startActivity(intent);
                    //回到欢迎界面
                }
            });
            builder.show();
        }
    }
}
