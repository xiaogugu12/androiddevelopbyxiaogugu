package com.example.gutianyu.listviewtest2;

/**
 * Created by gutianyu on 2018/3/3.
 */

public class Fruit {
    private String  name;
    private int  imageId;
    public Fruit(String  name,int  imageId)
    {
        this.name=name;
        this.imageId=imageId;
    }
    public String  getName(){
        return  name;
    }
    public int  getImageId(){
        return  imageId;
    }//name表示水果的名字，imageId表示水果对应图片的资源id
}
