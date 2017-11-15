package com.example.hihib.fleaaflea;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hihib.fleaaflea.view.RecyclerViewAdapter;

/**
 * Created by hihib on 2017-10-20.
 */

public class ReviewFragment extends Fragment{
    public ReviewFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_review, container, false);

        RecyclerView view = (RecyclerView)layout.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter();
        view.setLayoutManager(layoutManager);
        view.setAdapter(recyclerViewAdapter);
        return layout;
    }
}
