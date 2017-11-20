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
import com.example.hihib.fleaaflea.Dessert.DessertInfoActvitiy;
import com.example.hihib.fleaaflea.Donong.DonongInfoActvitiy;
import com.example.hihib.fleaaflea.Dope.DopeInfoActvitiy;
import com.example.hihib.fleaaflea.MainStreet.StreetInfoActvitiy;
import com.example.hihib.fleaaflea.Mom.MomInfoActivity;
import com.example.hihib.fleaaflea.Respace.RespaceInfoActvitiy;

/**
 * Created by hihib on 2017-10-20.
 */

public class GangBukFragment extends Fragment implements View.OnClickListener{
    ImageView  respace, street, donong , dope , dessert, mom,changdong, citymarket ,bazzar;
    Intent it;
    public GangBukFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.gangbuk_fragment_home, container, false);

        respace = (ImageView) layout.findViewById(R.id.respace);
        street = (ImageView) layout.findViewById(R.id.street);
        donong = (ImageView) layout.findViewById(R.id.donong);
        dope = (ImageView) layout.findViewById(R.id.dope);
        dessert = (ImageView) layout.findViewById(R.id.dessert);
        mom = (ImageView) layout.findViewById(R.id.mom);
        changdong = (ImageView) layout.findViewById(R.id.changdong);
        citymarket = (ImageView) layout.findViewById(R.id.citymarket);
        bazzar = (ImageView) layout.findViewById(R.id.bazzar);

        respace.setOnClickListener(this);
        street.setOnClickListener(this);
        donong.setOnClickListener(this);
        dope.setOnClickListener(this);
        dessert.setOnClickListener(this);
        mom.setOnClickListener(this);
        changdong.setOnClickListener(this);
        citymarket.setOnClickListener(this);
        bazzar.setOnClickListener(this);

        return layout;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {

            case R.id.respace:
                it = new Intent(getActivity() , RespaceInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.street:
                it = new Intent(getActivity() , StreetInfoActvitiy.class);
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
            case R.id.dessert:
                it = new Intent(getActivity() , DessertInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.bazzar:
                it = new Intent(getActivity() , BazzarInfoActivity.class);
                startActivity(it);
                break;
            case R.id.citymarket:
                it = new Intent(getActivity() , CityMarketInfoActivity.class);
                startActivity(it);
                break;
            case R.id.mom:
                it = new Intent(getActivity() , MomInfoActivity.class);
                startActivity(it);
                break;
            case R.id.changdong:
                it = new Intent(getActivity() , ChangDongInfoActivity.class);
                startActivity(it);
                break;
        }

    }
}
