package com.example.seeing.practice_zouyun;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by seeing on 2019/1/6.
 */

public class Myfrag2 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment2_zouyun, container, false);
        return view;
    }

//    @Override
//    public void onAttach(Context context){
//        super.onAttach(context);
//        Bundle bundle = getArguments();
//        String msg = bundle.getString("name");
//        System.out.println("传递的消息为：" + msg);
//
//    }
}
