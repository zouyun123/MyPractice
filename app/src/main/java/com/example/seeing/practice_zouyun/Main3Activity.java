package com.example.seeing.practice_zouyun;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Fragment frag1 = new Myfrag1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn1 = (Button) findViewById(R.id.btn1_main3);

        btn1.setOnClickListener(this);

        Bundle bundle = new Bundle();
        bundle.putString("name", "邹鋆");
        frag1.setArguments(bundle);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1_main3:
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_main3, frag1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

        }
    }
}
