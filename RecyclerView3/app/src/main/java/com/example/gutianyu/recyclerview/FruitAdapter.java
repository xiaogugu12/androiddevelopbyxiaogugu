package com.example.gutianyu.recyclerview;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gutianyu on 2018/3/12.
 */

public class FruitAdapter  extends RecyclerView.Adapter<FruitAdapter.ViewHolder>{
    private List<Fruit> mFruitList;
    static class ViewHolder  extends RecyclerView.ViewHolder
    {
         ImageView fruitImage;
         TextView   fruitName;
         public  ViewHolder(View   view)
         {
             super(view);
             fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
             fruitName=(TextView)view.findViewById(R.id.fruit_name);
         }
    }
    public   FruitAdapter(List<Fruit>  fruitList)
    {
         mFruitList=fruitList;//把用于要展示的数据源传进来
        //并赋值给一个全局变量mFruitList
    }
    public   ViewHolder  onCreateViewHolder(ViewGroup   parent,int  viewType)
    {//用于创建View Holder实例
        View   view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        ViewHolder  holder=new ViewHolder(view);
        //将fruit_item布局加载出来，然后创建一个ViewHolder实例
        //把加载出来的布局传入构造函数，最后将ViewHolder的实例返回
        return   holder;
    }
    public  void  onBindViewHolder(ViewHolder  holder,int   position)
    {//用于对RecyclerView子项数据进行赋值
            Fruit  fruit=mFruitList.get(position);
            holder.fruitImage.setImageResource(fruit.getImageId());
            holder.fruitName.setText(fruit.getName());
    }
    public  int  getItemCount(){
        return   mFruitList.size();
        //告诉RecyclerView一共有多少子项
    }
}
