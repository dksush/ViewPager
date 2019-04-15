package com.example.viewpager;


import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.viewpager.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


   ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        ViewPager();

    }




    public void ViewPager(){
        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText("first"));
        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText("two"));
        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText("thiry"));

        // 뷰페이저와 탭 위치 및 옵션 세팅.
        TabLayoututil.tabScroll_Listener(this, mBinding.tabLayout, mBinding.viewpager, 0);


    }

}
