package com.example.hihib.fleaaflea;

import android.content.Intent;
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

public class MyPageFragment extends Fragment implements View.OnClickListener{
    Button fr_mypage_button_favorite,fr_mypage_button_report,fr_mypage_button_insert,fr_mypage_button_myinfo;
    View layout;
    Intent intent;
    public MyPageFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_mypage, container, false);
        fr_mypage_button_favorite = (Button)layout.findViewById(R.id.fr_mypage_button_favorite);
        fr_mypage_button_report = (Button)layout.findViewById(R.id.fr_mypage_button_report);
        fr_mypage_button_insert = (Button)layout.findViewById(R.id.fr_mypage_button_insert);
        fr_mypage_button_myinfo = (Button)layout.findViewById(R.id.fr_mypage_button_myinfo);

        fr_mypage_button_favorite.setOnClickListener(this);
        fr_mypage_button_report.setOnClickListener(this);
        fr_mypage_button_insert.setOnClickListener(this);
        fr_mypage_button_myinfo.setOnClickListener(this);

        return layout;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.fr_mypage_button_favorite:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                startActivity(intent);
                break;
            case R.id.fr_mypage_button_report:
                intent = new Intent(getActivity(), ReportActivity.class);
                startActivity(intent);
                break;
            case R.id.fr_mypage_button_insert:
                intent = new Intent(getActivity(), InsertActivity.class);
                startActivity(intent);
                break;
            case R.id.fr_mypage_button_myinfo:
                Toast.makeText(getActivity() , "로그인을 해주세요" ,Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
