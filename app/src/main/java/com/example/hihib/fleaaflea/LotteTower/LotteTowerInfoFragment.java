package com.example.hihib.fleaaflea.LotteTower;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hihib.fleaaflea.R;

/**
 * Created by hihib on 2017-10-20.
 */

public class LotteTowerInfoFragment extends Fragment{
    TextView marketurl;
    String URL = "http://www.laboratoryfart.com";
    public LotteTowerInfoFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View layout = inflater.inflate(R.layout.fragment_lottetower_info, container, false);

        marketurl = (TextView) layout.findViewById(R.id.marketurl);
        marketurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
                startActivity(it);
            }
        });
        return layout;
    }
}
