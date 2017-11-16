package com.example.hihib.fleaaflea;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hihib.fleaaflea.view.CommonSharedPref;
import com.example.hihib.fleaaflea.view.Constants;

public class ReviewPopupActivity extends Activity implements View.OnClickListener{
    Button thema_review_button_submit;
    String name,msg;
    EditText reivew_name,reivew_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        WindowManager.LayoutParams layoutParams= new WindowManager.LayoutParams();
        layoutParams.flags= WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        layoutParams.dimAmount= 0.9f;
        getWindow().setAttributes(layoutParams);
        setContentView(R.layout.activity_review_popup);
        thema_review_button_submit = (Button)findViewById(R.id.thema_review_button_submit);
        thema_review_button_submit.setOnClickListener(this);
        reivew_name = (EditText)findViewById(R.id.reivew_name);
        reivew_msg = (EditText)findViewById(R.id.reivew_msg);

        CommonSharedPref.setStringValue(getApplicationContext(),Constants.KEY_NAME,reivew_name.getText().toString());
        CommonSharedPref.setStringValue(getApplicationContext(),Constants.KEY_MSG,reivew_name.getText().toString());
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.thema_review_button_submit:
                Log.d("333333333333333333","******"+name);
                Log.d("222222222222222222","******"+msg);
                finish();
                break;
        }

    }
}
