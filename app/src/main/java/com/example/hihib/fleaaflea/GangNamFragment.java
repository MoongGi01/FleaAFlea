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
import com.example.hihib.fleaaflea.DessertFare.DessertFareInfoActvitiy;
import com.example.hihib.fleaaflea.Flower.FlowerInfoActvitiy;

/**
 * Created by hihib on 2017-10-20.
 */

public class GangNamFragment extends Fragment implements View.OnClickListener{
    ImageView  dessertfare, flower ;
    Intent it;
    public GangNamFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.gangnam_fragment_home, container, false);

        dessertfare = (ImageView) layout.findViewById(R.id.dessertfare);
        flower = (ImageView) layout.findViewById(R.id.flower);

        dessertfare.setOnClickListener(this);
        flower.setOnClickListener(this);

        return layout;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {

            case R.id.dessertfare:
                it = new Intent(getActivity() , DessertFareInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.flower:
                it = new Intent(getActivity() , FlowerInfoActvitiy.class);
                startActivity(it);
                break;
        }

    }
}
