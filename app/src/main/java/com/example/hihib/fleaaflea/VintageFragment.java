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
import com.example.hihib.fleaaflea.Donong.DonongInfoActvitiy;
import com.example.hihib.fleaaflea.Dope.DopeInfoActvitiy;
import com.example.hihib.fleaaflea.Mom.MomInfoActivity;
import com.example.hihib.fleaaflea.RainBow.RainBowInfoActvitiy;

/**
 * Created by hihib on 2017-10-20.
 */

public class VintageFragment extends Fragment implements View.OnClickListener{
    ImageView  bazzar, changdong, citymarket ;
    Intent it;
    public VintageFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.vintage_fragment_home, container, false);

        bazzar = (ImageView) layout.findViewById(R.id.bazzar);
        changdong = (ImageView) layout.findViewById(R.id.changdong);
        citymarket = (ImageView) layout.findViewById(R.id.citymarket);

        bazzar.setOnClickListener(this);
        changdong.setOnClickListener(this);
        citymarket.setOnClickListener(this);

        return layout;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {

            case R.id.bazzar:
                it = new Intent(getActivity() , BazzarInfoActivity.class);
                startActivity(it);
                break;
            case R.id.changdong:
                it = new Intent(getActivity() , ChangDongInfoActivity.class);
                startActivity(it);
                break;
            case R.id.citymarket:
                it = new Intent(getActivity() , CityMarketInfoActivity.class);
                startActivity(it);
                break;
        }

    }
}
