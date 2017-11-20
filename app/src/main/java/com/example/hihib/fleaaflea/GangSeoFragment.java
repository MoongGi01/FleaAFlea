package com.example.hihib.fleaaflea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.hihib.fleaaflea.Bazzar.BazzarInfoActivity;
import com.example.hihib.fleaaflea.ChangDong.ChangDongInfoActivity;
import com.example.hihib.fleaaflea.CityMarket.CityMarketInfoActivity;
import com.example.hihib.fleaaflea.RainBow.RainBowInfoActvitiy;
import com.example.hihib.fleaaflea.Yg.YgInfoActivity;

/**
 * Created by hihib on 2017-10-20.
 */

public class GangSeoFragment extends Fragment implements View.OnClickListener{
    ImageView  yg, rainbow ;
    Intent it;
    public GangSeoFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.gangseo_fragment_home, container, false);

        yg = (ImageView) layout.findViewById(R.id.yg);
        rainbow = (ImageView) layout.findViewById(R.id.rainbow);

        yg.setOnClickListener(this);
        rainbow.setOnClickListener(this);

        return layout;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {

            case R.id.yg:
                it = new Intent(getActivity() , YgInfoActivity.class);
                startActivity(it);
                break;
            case R.id.rainbow:
                it = new Intent(getActivity() , RainBowInfoActvitiy.class);
                startActivity(it);
                break;
        }

    }
}
