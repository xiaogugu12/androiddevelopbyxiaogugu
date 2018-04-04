package com.example.gutianyu.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gutianyu on 2018/3/16.
 */

public class LeftFragment  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View  view=inflater.inflate(R.layout.left_fragment,container,false);
        return  view;
    }
}
