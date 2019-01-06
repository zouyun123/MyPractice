package com.example.seeing.practice_zouyun;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by seeing on 2019/1/6.
 */

public class Frag2_main4 extends Fragment {

    private TextView textView;
    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View view = inflater.inflate(R.layout.frag2_main4, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
            textView = (TextView) getActivity().findViewById(R.id.text1_main4);

        Bundle bundle = getArguments();
        String a = bundle.getString("name");
        textView.setText(a);
    }
}
