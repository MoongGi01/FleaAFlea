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

import com.example.hihib.fleaaflea.Bazzar.BazzarInfoActivity;
import com.example.hihib.fleaaflea.ChangDong.ChangDongInfoActivity;
import com.example.hihib.fleaaflea.ChunHo.ChunHoInfoActivity;
import com.example.hihib.fleaaflea.CityMarket.CityMarketInfoActivity;
import com.example.hihib.fleaaflea.LotteTower.LotteTowerInfoActivity;
import com.example.hihib.fleaaflea.Mom.MomInfoActivity;
import com.example.hihib.fleaaflea.Yg.YgInfoActivity;

/**
 * Created by hihib on 2017-10-20.
 */

public class HomeFragment extends Fragment implements View.OnClickListener{
    ImageView figure ,respace, lottetower, bazzar, citymarket, yg, mom, chunho, changdong;
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
        respace = (ImageView) layout.findViewById(R.id.respace);
        lottetower = (ImageView) layout.findViewById(R.id.lottetower);
        bazzar = (ImageView) layout.findViewById(R.id.bazzar);
        citymarket = (ImageView) layout.findViewById(R.id.citymarket);
        yg = (ImageView) layout.findViewById(R.id.yg);
        mom = (ImageView) layout.findViewById(R.id.mom);
        chunho = (ImageView) layout.findViewById(R.id.chunho);
        changdong = (ImageView) layout.findViewById(R.id.changdong);
        figure.setOnClickListener(this);
        respace.setOnClickListener(this);
        lottetower.setOnClickListener(this);
        bazzar.setOnClickListener(this);
        citymarket.setOnClickListener(this);
        yg.setOnClickListener(this);
        mom.setOnClickListener(this);
        chunho.setOnClickListener(this);
        changdong.setOnClickListener(this);
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
            case R.id.respace:
                it = new Intent(getActivity() , MarketInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.lottetower:
                it = new Intent(getActivity() , LotteTowerInfoActivity.class);
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
            case R.id.yg:
                it = new Intent(getActivity() , YgInfoActivity.class);
                startActivity(it);
                break;
            case R.id.mom:
                it = new Intent(getActivity() , MomInfoActivity.class);
                startActivity(it);
                break;
            case R.id.chunho:
                it = new Intent(getActivity() , ChunHoInfoActivity.class);
                startActivity(it);
                break;
            case R.id.changdong:
                it = new Intent(getActivity() , ChangDongInfoActivity.class);
                startActivity(it);
                break;

        }

    }
}
