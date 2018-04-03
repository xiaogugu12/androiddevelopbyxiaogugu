package com.example.gutianyu.timeapp;

import android.content.Context;
import android.graphics.PixelFormat;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private List<picture> picturesList = new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdates();
        PictureAdapter adapter = new PictureAdapter(MainActivity.this, R.layout.picture_item, picturesList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        //通过上面这句确定了ListView的位置
        listView.setAdapter(adapter);
    }
    private void initdates() {
        for (int i = 0; i < 2; i++) {
            picture item1 = new picture("时间1", "时间2", "时间3", R.drawable.ic_launcher_background);
            picturesList.add(item1);
            picture item2 = new picture("时间1", "时间2", "时间3", R.drawable.mm1);
            picturesList.add(item2);
        }
    }
}
