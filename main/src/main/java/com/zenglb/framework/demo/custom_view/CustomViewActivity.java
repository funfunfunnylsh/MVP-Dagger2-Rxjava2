package com.zenglb.framework.demo.custom_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zenglb.framework.R;

/**
 * onDispatchTouch-->onIntercept-->onTouch
 *
 *
 */
public class CustomViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
    }




}
