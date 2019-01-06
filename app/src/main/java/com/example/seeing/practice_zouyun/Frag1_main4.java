package com.example.seeing.practice_zouyun;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by seeing on 2019/1/6.
 */

public class Frag1_main4 extends Fragment {

    private Button btn1;
    private Frag2_main4 frag = new Frag2_main4();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View view = inflater.inflate(R.layout.farg1_main4, container, false);


        Bundle bundle = new Bundle();
        bundle.putString("name", "aoao");
        frag.setArguments(bundle);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        /** getActivity()方法必须在活动建立后调用，故应放在onActivity（）方法后的生命周期内的方法调用，若放在
            onCreateView方法中，程序会闪退。
         */
        btn1 = (Button) getActivity().findViewById(R.id.btn1_main4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.linearlayout1_main4, frag);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}
