package com.example.gutianyu.fragment;

import android.support.fragment.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        replaceFragment(new  RightFragment());
    }
    public void  onClick(View v)
    {
        switch (v.getId()){
            case R.id.button:
                replaceFragment(new  AnotherRightFragment());
                break;
            default:
                break;
        }
    }
    private void  replaceFragment(Fragment  fragment)
    {
        FragmentManager  fragmentManager=getSupportFragmentManager();
        FragmentTransaction  transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.right_fragment,fragment);
        transaction.commit();
    }
}
