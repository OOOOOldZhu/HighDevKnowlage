package com.z.highknowlage.EventBus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.z.highknowlage.R;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    //只有带Subscribe的方法才会记录到EventBus里面
    @Subscribe(threadMode = ThreadMode.MAIN)
    void getMsg(String msg){

    }

}
