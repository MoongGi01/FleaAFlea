package com.example.hihib.fleaaflea.Flower;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.hihib.fleaaflea.R;
import com.example.hihib.fleaaflea.ReviewPopupActivity;
import com.example.hihib.fleaaflea.view.CommonSharedPref;
import com.example.hihib.fleaaflea.view.Constants;
import com.example.hihib.fleaaflea.view.RecyclerViewAdapter;

/**
 * Created by hihib on 2017-10-20.
 */

public class FlowerReviewFragment extends Fragment implements View.OnClickListener{
    ImageView image_review_change;
    String name,msg;

    public FlowerReviewFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.flower_fragment_review, container, false);
        try
        {
            name = CommonSharedPref.getStringValue(getContext(), Constants.KEY_NAME);
            msg = CommonSharedPref.getStringValue(getContext(), Constants.KEY_MSG);
            Log.d("*********************","******"+name);
            Log.d("*********************","******"+msg);
        }
        catch (NullPointerException e)
        {
            e.toString();
        }
        image_review_change = (ImageView) layout.findViewById(R.id.image_review_change);
        image_review_change.setOnClickListener(this);
        RecyclerView view = (RecyclerView)layout.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(name,msg);
        view.setLayoutManager(layoutManager);
        view.setAdapter(recyclerViewAdapter);
        return layout;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.image_review_change:
                Intent it = new Intent(getActivity() , ReviewPopupActivity.class);
                startActivity(it);
                break;
        }

    }
}
