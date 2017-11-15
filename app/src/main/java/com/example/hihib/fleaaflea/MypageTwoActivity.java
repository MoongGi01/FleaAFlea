package com.example.hihib.fleaaflea;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MypageTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       Intent intent = getIntent();
       String type = intent.getStringExtra("type");
        Log.d("MypageTwoActivity",""+type);
        if(type.equals("favorite"))
        {
            Log.d("MypageTwoActivity","favorite");
            setContentView(R.layout.fragment_favorite);
        }
        if(type.equals("report"))
        {
            Log.d("MypageTwoActivity","report");
            setContentView(R.layout.fragment_report);
        }
        if(type.equals("insert"))
        {
            Log.d("MypageTwoActivity","insert");
            setContentView(R.layout.fragment_insert);
        }
        if(type.equals("myinfo"))
        {
            Log.d("MypageTwoActivity","myinfo");
            setContentView(R.layout.fragment_myinfo);
        }

    }
}
