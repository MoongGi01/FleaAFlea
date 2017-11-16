package com.example.hihib.fleaaflea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class InsertActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView main_backkey;
    TextView main_page_submit;
    Button activity_insert_button_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        main_backkey = (ImageView)findViewById(R.id.main_backkey);
        main_page_submit = (TextView) findViewById(R.id.main_page_submit);
        activity_insert_button_submit = (Button) findViewById(R.id.activity_insert_button_submit);

        main_backkey.setOnClickListener(this);
        main_page_submit.setOnClickListener(this);
        activity_insert_button_submit.setOnClickListener(this);
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
