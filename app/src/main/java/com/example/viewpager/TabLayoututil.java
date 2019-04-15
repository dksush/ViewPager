package com.example.viewpager;

import android.content.Context;
import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

public class TabLayoututil {
   public static void tabScroll_Listener(final Context context, TabLayout tabLayout, final ViewPager vp, int tabFisetPostion){ // 색은 옵션이지.
       TabLayout tab = tabLayout;
       final ViewPager viewPager = vp;
      // tab.setSelectedTabIndicatorColor(color); // 텝 선택시 따라오는 인디케이터(하단바?) 색.
       tab.setSelectedTabIndicatorColor(ContextCompat.getColor(context,R.color.color_ff6f61));


       // 뷰페이저 전환 시 탭의 위치를 맞춘다.
       viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

       // 탭 전환시 뷰페이저 위치를 맞춘다.
       // 탭 ui 에 대한 옵션들.
       tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {

               viewPager.setCurrentItem(tab.getPosition());

               // 선택 여부에 따라 색에 변화를 준다.
               ((TextView) tab.getCustomView()).setTextColor(ContextCompat.getColor(context, R.color.color_ff6f61)); // 글자색
               ((TextView)tab.getCustomView()).setTypeface(null, Typeface.BOLD); // 굴게.

           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {
               ((TextView) tab.getCustomView()).setTextColor(ContextCompat.getColor(context, R.color.color_333333));
               ((TextView)tab.getCustomView()).setTypeface(null, Typeface.NORMAL);

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {

           }
       });

   }


}
