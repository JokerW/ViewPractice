package com.example.joker.viewpractice.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.joker.viewpractice.R;
import com.example.joker.viewpractice.fragment.GridViewDemoFragment;

/**
 * Created by xiufengwang on 2015/12/8.
 */
public class OverScrollActivity extends AppCompatActivity implements NavigationView
        .OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overscroll_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.app_toolbar);
        toolbar.setTitle(R.string.grid_view_demo_title);
        setSupportActionBar(toolbar);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R
                .string.drawer_open, R.string.drawer_close);
        mDrawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        getFragmentManager().beginTransaction().setCustomAnimations(R.animator.fade_in_slow, R
                .animator.fade_out_quick).replace(R.id.fragment_layout, new GridViewDemoFragment
                ()).commit();


    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        final int id = item.getItemId();
        item.setChecked(true);

        switch (id) {
            case R.id.gridview:

                break;
            case R.id.listview:

                break;
            case R.id.recyclerview:

                break;
            case R.id.scrollview:

                break;
            case R.id.miscview:

                break;
        }

        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void replaceMainFragment(Fragment fragment, int titleResId) {
        getFragmentManager().beginTransaction().setCustomAnimations(R.animator.fade_in_slow, R
                .animator.fade_out_quick).replace(R.id.fragment_layout, fragment).commit();
        getSupportActionBar().setTitle(titleResId);
    }

}
