package com.example.gutianyu.recyclerview;

/**
 * Created by gutianyu on 2018/3/12.
 */

public class Fruit
{
    private  String  name;
    private  int   imageId;
    public   Fruit(String  name,int  imageId)
    {
        this.name=name;
        this.imageId=imageId;
    }
    public   String  getName(){
        return   name;
    }
    public  int  getImageId()
    {
        return   imageId;
    }
}
