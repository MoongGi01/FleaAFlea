package com.example.hihib.fleaaflea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyinfoActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageView main_backkey;
    TextView main_page_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myinfo);
        main_backkey = (ImageView)findViewById(R.id.main_backkey);
        main_page_submit = (TextView) findViewById(R.id.main_page_submit);

        main_backkey.setOnClickListener(this);
        main_page_submit.setOnClickListener(this);
    }

        @Override
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.main_backkey:
                    this.onBackPressed();
                    break;
                case R.id.main_page_submit:
                    Intent it = new Intent(getApplicationContext() , MainActivity.class);
                    startActivity(it);
                    finish();
                    break;
            }

        }
}
