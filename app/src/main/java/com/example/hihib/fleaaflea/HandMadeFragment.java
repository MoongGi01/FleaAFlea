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
import com.example.hihib.fleaaflea.ChunHo.ChunHoInfoActivity;
import com.example.hihib.fleaaflea.CityMarket.CityMarketInfoActivity;
import com.example.hihib.fleaaflea.Dessert.DessertInfoActvitiy;
import com.example.hihib.fleaaflea.DessertFare.DessertFareInfoActvitiy;
import com.example.hihib.fleaaflea.Donong.DonongInfoActvitiy;
import com.example.hihib.fleaaflea.Dope.DopeInfoActvitiy;
import com.example.hihib.fleaaflea.Flower.FlowerInfoActvitiy;
import com.example.hihib.fleaaflea.LotteTower.LotteTowerInfoActivity;
import com.example.hihib.fleaaflea.MainStreet.StreetInfoActvitiy;
import com.example.hihib.fleaaflea.Mom.MomInfoActivity;
import com.example.hihib.fleaaflea.RainBow.RainBowInfoActvitiy;
import com.example.hihib.fleaaflea.Yg.YgInfoActivity;

/**
 * Created by hihib on 2017-10-20.
 */

public class HandMadeFragment extends Fragment implements View.OnClickListener{
    ImageView  donong, dope, rainbow ;
    ImageView  mom;

    Intent it;
    public HandMadeFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.handmade_fragment_home, container, false);

        mom = (ImageView) layout.findViewById(R.id.mom);
        donong = (ImageView) layout.findViewById(R.id.donong);
        dope = (ImageView) layout.findViewById(R.id.dope);
        rainbow = (ImageView) layout.findViewById(R.id.rainbow);

        mom.setOnClickListener(this);
        donong.setOnClickListener(this);
        dope.setOnClickListener(this);
        rainbow.setOnClickListener(this);

        return layout;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {

            case R.id.mom:
                it = new Intent(getActivity() , MomInfoActivity.class);
                startActivity(it);
                break;
            case R.id.donong:
                it = new Intent(getActivity() , DonongInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.dope:
                it = new Intent(getActivity() , DopeInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.rainbow:
                it = new Intent(getActivity() , RainBowInfoActvitiy.class);
                startActivity(it);
                break;
        }

    }
}
