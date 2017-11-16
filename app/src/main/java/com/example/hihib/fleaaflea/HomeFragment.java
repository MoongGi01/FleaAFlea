package com.example.hihib.fleaaflea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by hihib on 2017-10-20.
 */

public class HomeFragment extends Fragment implements View.OnClickListener{
    ImageView figure , frand , letsrun ,respace;
    Intent it;
    public HomeFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_home, container, false);
        figure = (ImageView) layout.findViewById(R.id.figure);
        frand = (ImageView) layout.findViewById(R.id.frand);
        letsrun = (ImageView) layout.findViewById(R.id.letsrun);
        respace = (ImageView) layout.findViewById(R.id.respace);
        figure.setOnClickListener(this);
        frand.setOnClickListener(this);
        letsrun.setOnClickListener(this);
        respace.setOnClickListener(this);
        return layout;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.figure:
                Intent it = new Intent(getActivity() , MarketInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.frand:
                Toast.makeText(getActivity(),"마켓 준비중입니다.",Toast.LENGTH_LONG).show();
                break;
            case R.id.letsrun:
                Toast.makeText(getActivity(),"마켓 준비중입니다.",Toast.LENGTH_LONG).show();
                break;
            case R.id.respace:
                it = new Intent(getActivity() , MarketInfoActvitiy.class);
                startActivity(it);
                break;
        }

    }
}
