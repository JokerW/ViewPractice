package com.example.joker.viewpractice.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

import com.example.joker.viewpractice.R;

/**
 * Created by xiufengwang on 2015/11/25.
 */
public class SimpleCoordinatorActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_coordinator);
        CollapsingToolbarLayout toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.simple_collaps);
        toolbarLayout.setTitle(getString(R.string.app_name));
    }


    public static void start(Context context) {
        context.startActivity(new Intent(context, SimpleCoordinatorActivity.class));
    }
}
