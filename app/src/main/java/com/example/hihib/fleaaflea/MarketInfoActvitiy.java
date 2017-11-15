package com.example.hihib.fleaaflea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class MarketInfoActvitiy extends AppCompatActivity {

    ViewPager vp;
    View view;
    Toolbar toolbar;
    BottomNavigationView navigation;
    Fragment selected;
    FragmentTransaction fragmentTransaction;
    RelativeLayout rl;
    int fragment_choice;
    boolean choice=false;
    Intent it;

    final Fragment fragment_info = new InfoFragment();
    final Fragment fragment_review = new ReviewFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maket_info);
        vp=(ViewPager)findViewById(R.id.vp);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container,fragment_info).commit();
        getTabLayout();
    }
    void getToolbar()
    {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        vp.setAdapter(new MarketInfoActvitiy.pagerAdapter(getSupportFragmentManager()));
//        vp.setCurrentItem(0);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position)
            {
                MenuItem item = navigation.getMenu().getItem(position);
                item.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    void getTabLayout()
    {
        TabLayout tabs = (TabLayout)findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("마켓정보"));
        tabs.addTab(tabs.newTab().setText("리뷰"));
        tabs.setSelected(false);

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                fragment_choice = tab.getPosition();
                selected = null;
                if(fragment_choice==0)
                {
                    selected = fragment_info;
                }
                if(fragment_choice==1)
                {
                    selected = fragment_review;
                }

                fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,selected).commit();
                rl = (RelativeLayout)findViewById(R.id.container);
                rl.setVisibility(View.VISIBLE);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_market_report:
                    it = new Intent(MarketInfoActvitiy.this , MainActivity.class);
                    it.putExtra("item",0);
                    startActivity(it);
                    finish();
                    return true;
                case R.id.navigation_home:
                    it = new Intent(MarketInfoActvitiy.this , MainActivity.class);
                    it.putExtra("item",1);
                    startActivity(it);
                    finish();
                    return true;
                case R.id.navigation_mypage:
                    it = new Intent(MarketInfoActvitiy.this , MainActivity.class);
                    it.putExtra("item",2);
                    startActivity(it);
                    finish();
                    return true;
            }
            return false;
        }

    };
    private class pagerAdapter extends FragmentStatePagerAdapter
    {
        public pagerAdapter(android.support.v4.app.FragmentManager fm)
        {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {

            switch (position)
            {
                case 0:
                    return new MarketReportFragment();
                case 1:
                    return new HomeFragment();
                case 2:
                    return new MyPageFragment();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}