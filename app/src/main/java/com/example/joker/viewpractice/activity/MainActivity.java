package com.example.joker.viewpractice.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.joker.viewpractice.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.main_coordinator_textview).setOnClickListener(this);
        findViewById(R.id.main_materialup_textview).setOnClickListener(this);
        findViewById(R.id.main_ioexample_textview).setOnClickListener(this);
        findViewById(R.id.main_space_textview).setOnClickListener(this);
        findViewById(R.id.main_swipebehavior_textview).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_coordinator_textview:
                SimpleCoordinatorActivity.start(this);
                break;

            case R.id.main_ioexample_textview:
                IOActivityExample.start(this);
                break;

            case R.id.main_space_textview:
                FlexibleSpaceExampleActivity.start(this);
                break;

            case R.id.main_materialup_textview:
                MaterialUpConceptActivity.start(this);
                break;

            case R.id.main_swipebehavior_textview:
                SwipeBehaviorExampleActivity.start(this);
                break;
        }
    }
}
