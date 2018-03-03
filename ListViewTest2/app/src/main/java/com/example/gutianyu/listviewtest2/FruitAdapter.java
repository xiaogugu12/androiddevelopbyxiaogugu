package com.example.gutianyu.listviewtest2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gutianyu on 2018/3/3.
 */

public class FruitAdapter  extends ArrayAdapter<Fruit> {
    private int  resourceId;
    public  FruitAdapter(Context  context, int  textViewResourceId, List<Fruit>  objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    //FruitAdapter重写了父类的一组构造函数，用于将上下文，
    //List View子项布局的id，数据都传过来
    public View getView(int  position, View  convertView, ViewGroup  parent)
    {
        Fruit  fruit=getItem(position);//获取当前项的Fruit实例
        View   view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView  fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
        TextView  fruitName=(TextView)view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        return view;
    }
}
