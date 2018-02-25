package com.example.gutianyu.uielementary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText  editText;
    private ImageView  imageView;
    private ProgressBar  progressBar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.edit_text);
        imageView=(ImageView)findViewById(R.id.image_view);
        progressBar=(ProgressBar)findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
    }
    public void  onClick(View  v)
    {
        switch (v.getId()){
            case R.id.button:
                int  progress=progressBar.getProgress();
                progress=progress+10;
                progressBar.setProgress(progress);
                break;
            default:
                break;
        }
    }
}
