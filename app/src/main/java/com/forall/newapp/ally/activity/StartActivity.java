package com.forall.newapp.ally.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


import com.forall.newapp.ally.R;

/**
 * Created by kim-hyonjun on 2018/01/19.
 * 기동화면. 로고 표시
 */

public class StartActivity extends AppCompatActivity {

    private static final int TIME_OUT = 2000; //ms
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(StartActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }
}
