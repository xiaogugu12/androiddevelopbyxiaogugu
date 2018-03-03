package com.example.gutianyu.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[]  data={"Apple","Banana",
    "Orange","Watermelon","Pear","Grape","Pineapple","Strawberry",
    "Cherry","Mango","Apple","Banana","Orange","Watermelon","Pear",
    "Grape","Pineapple","Strawberry","Cherry","Mango"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String>  adapter=new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,data);
        //利用android.R.layout.simple.list_item_1作为ListView子项布局的id

        ListView  listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        //最后调用ListView中的setAdapter将构造好的
        //适配器对象传递过去

    }
}
