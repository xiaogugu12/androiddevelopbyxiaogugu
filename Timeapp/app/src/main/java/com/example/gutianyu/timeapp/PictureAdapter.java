package com.example.gutianyu.timeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by gutianyu on 2018/4/1.
 */

public class PictureAdapter  extends ArrayAdapter<picture> {
    private int  resourceId;
    public PictureAdapter(Context  context, int  textViewResourceId, List<picture>  objects)
    {
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    public View getView(int  position, View  convertView, ViewGroup  parent)
    {
        picture  picturem=getItem(position);
        View  view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView  pictureImag=(ImageView)view.findViewById(R.id.picture_image);
        TextView pictureName1=(EditText) view.findViewById(R.id.picture_name1);
        TextView   pictureName2=(EditText) view.findViewById(R.id.picture_name2);
        TextView   pictureName3=(EditText) view.findViewById(R.id.picture_name3);
        pictureName1.setText(picturem.getName1());
        pictureName2.setText(picturem.getName2());
        pictureName3.setText(picturem.getName3());
        return  view;
    }
}
