package com.example.gutianyu.decidebyonselfpart;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.jar.Attributes;

/**
 * Created by gutianyu on 2018/2/27.
 */

public class TitleLayout  extends Li
        nearLayout {
    public   TitleLayout(Context context, Attributes  attrs)
    {
        super(context, (AttributeSet) attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button  titleBack=(Button)findViewById(R.id.title_back);
        Button  titleEdit=(Button)findViewById(R.id.title_edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You  clicked  Edit  button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
