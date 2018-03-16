package com.example.gutianyu.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit>  fruitList=new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        Log.d("m","1");
        RecyclerView  recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Log.d("m","2");
        FruitAdapter  adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
        Log.d("m","3");
    }
    public  void  initFruits()
    {
        for(int  i=0;i<2;i++)
        {
            Fruit  apple=new Fruit("Apple",R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit  banana=new Fruit("Banana",R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit  orange=new Fruit("Orange",R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit  watermelon=new Fruit("Watermelon",R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit  pear=new Fruit("Pear",R.drawable.watermelon_pic);
            fruitList.add(pear);
            Fruit  grape=new Fruit("Grape",R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit  pineapple=new Fruit("Pineapple",R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit  strawberry=new Fruit("Strawberry",R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit  berry=new Fruit("Strawberry",R.drawable.mango_pic);
            fruitList.add(berry);
            Fruit  mango=new Fruit("Mango",R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }
}
