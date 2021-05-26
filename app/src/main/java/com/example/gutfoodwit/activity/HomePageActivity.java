package com.example.gutfoodwit.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Toast;

import com.example.gutfoodwit.base.BaseActivity;
import com.example.gutfoodwit.fragment.EmptyLoopViewPagerFragment;
import com.edwin.loopviewpager.R;


public class HomePageActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void setUpContentView() {
        setContentView(R.layout.activity_home_page);
    }

    @Override
    protected void setUpView() { }

    @Override
    protected void setUpData(Bundle savedInstanceState) {
        LoopViewPagerToEmpty();
    }

    private void LoopViewPagerToEmpty() {
        EmptyLoopViewPagerFragment instance = EmptyLoopViewPagerFragment.getInstance();

        replace(instance);

        Toast.makeText(mContext, "replace  Empty successful", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
    }

    private void replace(Fragment fragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_content, fragment);
        fragmentTransaction.commit();
    }
}
