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
import com.example.hihib.fleaaflea.DessertFare.DessertFareInfoActvitiy;
import com.example.hihib.fleaaflea.DessertFare.DessertFareInfoFragment;
import com.example.hihib.fleaaflea.LotteTower.LotteTowerInfoActivity;
import com.example.hihib.fleaaflea.MainStreet.StreetInfoActvitiy;
import com.example.hihib.fleaaflea.Respace.RespaceInfoActvitiy;
import com.example.hihib.fleaaflea.Yg.YgInfoActivity;

/**
 * Created by hihib on 2017-10-20.
 */

public class FestivalFragment extends Fragment implements View.OnClickListener{
    ImageView  respace, yg, street,dessert,dessertfare,lottetower ;
    Intent it;
    public FestivalFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.festival_fragment_home, container, false);

        respace = (ImageView) layout.findViewById(R.id.respace);
        yg = (ImageView) layout.findViewById(R.id.yg);
        street = (ImageView) layout.findViewById(R.id.street);
        dessert = (ImageView) layout.findViewById(R.id.dessert);
        dessertfare = (ImageView) layout.findViewById(R.id.dessertfare);
        lottetower = (ImageView) layout.findViewById(R.id.lottetower);

        respace.setOnClickListener(this);
        yg.setOnClickListener(this);
        street.setOnClickListener(this);
        dessert.setOnClickListener(this);
        dessertfare.setOnClickListener(this);
        lottetower.setOnClickListener(this);

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
            case R.id.yg:
                it = new Intent(getActivity() , YgInfoActivity.class);
                startActivity(it);
                break;
            case R.id.street:
                it = new Intent(getActivity() , StreetInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.dessert:
                it = new Intent(getActivity() , DessertInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.dessertfare:
                it = new Intent(getActivity() , DessertFareInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.lottetower:
                it = new Intent(getActivity() , LotteTowerInfoActivity.class);
                startActivity(it);
                break;
        }

    }
}
