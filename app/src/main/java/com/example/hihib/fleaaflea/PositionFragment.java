package com.example.hihib.fleaaflea;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by hihib on 2017-10-20.
 */

public class PositionFragment extends Fragment implements View.OnClickListener{
    Button kangseo_button,kangnam_button,kangbuk_button,kangdong_button;
    Activity root = getActivity();
    public PositionFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_position, container, false);
        kangseo_button = (Button) view.findViewById(R.id.kangseo_button);
        kangnam_button = (Button) view.findViewById(R.id.kangnam_button);
        kangbuk_button = (Button) view.findViewById(R.id.kangbuk_button);
        kangdong_button = (Button) view.findViewById(R.id.kangdong_button);

        kangbuk_button.setOnClickListener(this);
        kangseo_button.setOnClickListener(this);
        kangnam_button.setOnClickListener(this);
        kangdong_button.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.kangseo_button:
                Toast.makeText(getActivity() , "강서", Toast.LENGTH_LONG ).show();
                break;
            case R.id.kangbuk_button:
                Toast.makeText(getActivity() , "강북", Toast.LENGTH_LONG ).show();
                break;
            case R.id.kangnam_button:
                Toast.makeText(getActivity() , "강남", Toast.LENGTH_LONG ).show();
                break;
            case R.id.kangdong_button:
                Toast.makeText(getActivity() , "강동", Toast.LENGTH_LONG ).show();
                break;

        }
    }
}
