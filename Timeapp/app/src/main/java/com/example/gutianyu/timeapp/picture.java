package com.example.gutianyu.timeapp;

/**
 * Created by gutianyu on 2018/4/1.
 */

public class picture {
    private  String  name1,name2,name3;
    private  int  imageid;
    public  picture(String  name1,String  name2,String  name3,int  imageid)
    {
        this.name1=name1;
        this.name2=name2;
        this.name3=name3;
        this.imageid=imageid;
    }
    public String  getName1()
    {
        return  name1;
    }
    public String  getName2()
    {
        return  name2;
    }
    public String  getName3()
    {
        return  name3;
    }
    public int  getImageId()
    {
        return  imageid;
    }
}
