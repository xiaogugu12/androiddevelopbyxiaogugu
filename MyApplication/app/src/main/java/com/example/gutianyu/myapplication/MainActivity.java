package com.example.gutianyu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You  clicked  Button 1",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public boolean  onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return   true;
        //inflate第一个参数指定通过R.menu.main来创建菜单
        //第二个参数指定我们的菜单添加到哪一个Menu对象中
    }//通过getMenuInflater的方法得到MenuInflater对象
    //再调用它的inflate()方法就可以给当前的活动创建菜单了
    //返回true表示允许菜单显示出来
     public boolean  onOptionsItemSelected(MenuItem  item)
     {
         switch (item.getItemId()){//通过调用item.getItemId()判断点击的是哪一个菜单项
             case  R.id.add_item:
                 Toast.makeText(this,"You  clicked  Add",Toast.LENGTH_SHORT).show();
                 break;
             case  R.id.remove_item:
                 Toast.makeText(this,"You  clicked  Remove",Toast.LENGTH_SHORT).show();
                 break;
         }
         return true;
     }
}
