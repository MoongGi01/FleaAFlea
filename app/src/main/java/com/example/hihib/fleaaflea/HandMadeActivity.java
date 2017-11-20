package com.example.hihib.fleaaflea;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kakao.auth.Session;

public class HandMadeActivity extends AppCompatActivity implements View.OnClickListener{

    Button main_login;
    ViewPager vp;
    View view;
    Toolbar toolbar;
    BottomNavigationView navigation;
    Fragment selected;
    FragmentTransaction fragmentTransaction;
    RelativeLayout rl;
    int fragment_choice;
    boolean choice=false;
    private PopupWindow mPopWindow;
    TabLayout tabs;
    int item = 1;
    TextView main_page_submit;
    ImageView main_backkey;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp=(ViewPager)findViewById(R.id.vp);
        main_login=(Button)findViewById(R.id.main_login);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        main_page_submit = (TextView)findViewById(R.id.main_page_submit);
        main_backkey = (ImageView)findViewById(R.id.main_backkey);
        main_backkey.setVisibility(View.VISIBLE);
        main_page_submit.setOnClickListener(this);
        main_backkey.setOnClickListener(this);

        getToolbar();
        getTabLayout();

        main_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {  SessionCallback callback; //위의 콜백함수를 만들어주셔야 사용가능합니다. 위의 함수를 만들어주세요~~


                //com.kakao.auth.Session.getCurrentSession().checkAndImplicitOpen();

                //한번이라도 로그인한 기록이있다면 위의함수에서 알아서 재로그인을 해줄것이다~

                callback = new SessionCallback(); //세션콜백을 부르고
                Session.getCurrentSession().addCallback(callback); // 추가시키면 끝입니다!!
            }
        });
    }
    void getToolbar()
    {
        Intent it = getIntent();
        item = it.getIntExtra("item",item);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        vp.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        vp.setCurrentItem(item);
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
        tabs = (TabLayout)findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("테마별검색"));
        tabs.addTab(tabs.newTab().setText("위치별검색"));
        tabs.setSelected(false);
        final Fragment fragment_thema = new ThemaFragment();
        final Fragment fragment_position = new PositionFragment();

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                fragment_choice = tab.getPosition();
                selected = null;
                if(fragment_choice==0)
              {
//                    View popupView = getLayoutInflater().inflate(R.layout.activity_thema_popup,null);
//                  mPopWindow = new PopupWindow(popupView);
//                  mPopWindow.setWindowLayoutMode(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
//                  mPopWindow.setFocusable(true);
//                  mPopWindow.setOutsideTouchable(true);
//                    mPopWindow.showAtLocation(popupView, Gravity.CENTER,0,0);
//                  mPopWindow.setBackgroundDrawable(new BitmapDrawable());
//                  mPopWindow.setAnimationStyle(R.style.Animation_AppCompat_DropDownUp);
//                  mPopWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);

                    Context context;
                    Intent it = new Intent(HandMadeActivity.this , ThemaPopupActivity.class);
                    startActivity(it);

                }
                if(fragment_choice==1)
                {
                    selected = fragment_position;
                    fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.container,selected).commit();
                    rl = (RelativeLayout)findViewById(R.id.container);
                    rl.setVisibility(View.VISIBLE);
                    vp.setVisibility(View.GONE);
                    choice=true;
                }
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
                    if (choice==false)
                    {
                        vp.setAdapter(new pagerAdapter(getSupportFragmentManager()));
                        vp.setCurrentItem(0);
                    }
                    if(choice==true)
                    {
                        rl.setVisibility(View.GONE);
                        vp.setVisibility(View.VISIBLE);
                        vp.setAdapter(new pagerAdapter(getSupportFragmentManager()));
                        vp.setCurrentItem(0);
                    }
                    return true;
                case R.id.navigation_home:
                    if (choice==false)
                    {
                    vp.setAdapter(new pagerAdapter(getSupportFragmentManager()));
                    vp.setCurrentItem(1);
                    }
                    if(choice==true)
                    {
                        rl.setVisibility(View.GONE);
                        vp.setVisibility(View.VISIBLE);
                        vp.setAdapter(new pagerAdapter(getSupportFragmentManager()));
                        vp.setCurrentItem(1);
                    }
                    return true;
                case R.id.navigation_mypage:
                    if (choice==false)
                    {
                        vp.setAdapter(new pagerAdapter(getSupportFragmentManager()));
                        vp.setCurrentItem(2);
                    }
                    if(choice==true)
                    {
                        rl.setVisibility(View.GONE);
                        vp.setVisibility(View.VISIBLE);
                        vp.setAdapter(new pagerAdapter(getSupportFragmentManager()));
                        vp.setCurrentItem(2);
                    }
                    return true;
            }
            return false;
        }

    };

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.main_backkey:
                finish();
                break;
            case R.id.main_page_submit:
                Intent it = new Intent(HandMadeActivity.this , MainActivity.class);
                startActivity(it);
                finish();
                break;
        }

    }

    private class pagerAdapter extends FragmentStatePagerAdapter
    {
        public pagerAdapter(FragmentManager fm)
        {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position)
            {
                case 0:
                    return new MarketReportFragment();
                case 1:
                    return new HandMadeFragment();
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