package com.example.hihib.fleaaflea;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class ThemaPopupActivity extends Activity implements View.OnClickListener{
    CheckBox checkbox_handmade , checkbox_vintage , checkbox_festival , checkbox_etc;
    Button thema_popup_button_submit;
    Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        WindowManager.LayoutParams layoutParams= new WindowManager.LayoutParams();
        layoutParams.flags= WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        layoutParams.dimAmount= 0.9f;
        getWindow().setAttributes(layoutParams);
        setContentView(R.layout.activity_thema_popup);

        checkbox_handmade = (CheckBox)findViewById(R.id.checkbox_handmade);
        checkbox_vintage = (CheckBox)findViewById(R.id.checkbox_vintage);
        checkbox_festival = (CheckBox)findViewById(R.id.checkbox_festival);
        checkbox_etc = (CheckBox)findViewById(R.id.checkbox_etc);
        thema_popup_button_submit = (Button)findViewById(R.id.thema_popup_button_submit);

        checkbox_handmade.setOnClickListener(this);
        checkbox_vintage.setOnClickListener(this);
        checkbox_festival.setOnClickListener(this);
        checkbox_etc.setOnClickListener(this);
        thema_popup_button_submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.checkbox_handmade:
                checkbox_vintage.setChecked(false);
                checkbox_festival.setChecked(false);
                checkbox_etc.setChecked(false);
                break;
            case R.id.checkbox_vintage:
                checkbox_handmade.setChecked(false);
                checkbox_festival.setChecked(false);
                checkbox_etc.setChecked(false);
                break;
            case R.id.checkbox_festival:
                checkbox_handmade.setChecked(false);
                checkbox_vintage.setChecked(false);
                checkbox_etc.setChecked(false);
                break;
            case R.id.checkbox_etc:
                checkbox_handmade.setChecked(false);
                checkbox_vintage.setChecked(false);
                checkbox_festival.setChecked(false);
                break;
            case R.id.thema_popup_button_submit:
                if(checkbox_handmade.isChecked())
                {
                    it = new Intent(ThemaPopupActivity.this , HandMadeActivity.class);
                    startActivity(it);
                    finish();
                }
                else if (checkbox_vintage.isChecked())
                {
                    it = new Intent(ThemaPopupActivity.this , VintageActivity.class);
                    startActivity(it);
                    finish();
                }
                else if (checkbox_festival.isChecked())
                {
                    it = new Intent(ThemaPopupActivity.this , FestivalActivity.class);
                    startActivity(it);
                    finish();
                }
                else if (checkbox_etc.isChecked())
                {
                    it = new Intent(ThemaPopupActivity.this , ETCActivity.class);
                    startActivity(it);
                    finish();
                }
                break;
        }
    }
}
