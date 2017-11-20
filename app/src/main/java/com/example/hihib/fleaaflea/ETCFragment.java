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

/**
 * Created by hihib on 2017-10-20.
 */

public class ETCFragment extends Fragment implements View.OnClickListener{
    ImageView  chunho ;
    Intent it;
    public ETCFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.etc_fragment_home, container, false);

        chunho = (ImageView) layout.findViewById(R.id.chunho);

        chunho.setOnClickListener(this);

        return layout;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {

            case R.id.chunho:
                it = new Intent(getActivity() , ChunHoInfoActivity.class);
                startActivity(it);
                break;
        }

    }
}
