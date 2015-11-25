package com.example.joker.viewpractice.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.joker.viewpractice.R;

public class IOActivityExample extends AppCompatActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_io_detail);

		Toolbar toolbar = (Toolbar) findViewById(R.id.ioexample_toolbar);
		toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override public void onClick(View v) {
				onBackPressed();
			}
		});
	}

	public static void start(Context c) {
		c.startActivity(new Intent(c, IOActivityExample.class));
	}}
