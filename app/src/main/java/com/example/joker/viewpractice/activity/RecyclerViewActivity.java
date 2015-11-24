package com.example.joker.viewpractice.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.joker.viewpractice.R;
import com.example.joker.viewpractice.adapter.RecyclerAdapter;

/**
 * Created by xiufengwang on 2015/11/20.
 */
public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] array = new String[]{
            "123",
            "456",
            "789",
            "123",
            "456",
            "789",
            "123",
            "456",
            "789",
            "123",
            "456",
            "789"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_layout);
        mRecycleView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecycleView.setHasFixedSize(true);
        mAdapter = new RecyclerAdapter(array);
        mLayoutManager = new LinearLayoutManager(this);
        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);
    }





}
