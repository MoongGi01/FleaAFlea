package com.example.hihib.fleaaflea.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hihib.fleaaflea.R;

import java.util.ArrayList;

/**
 * Created by hihib on 2017-10-31.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private ArrayList<MemberDTD> memberDTD = new ArrayList<>();


    public RecyclerViewAdapter(String name , String msg)
    {
        memberDTD.add(new MemberDTD("이진구 ","저는 피규어를 정말 좋아하는데 재미있었어요"));
        memberDTD.add(new MemberDTD("오진석 ","친구 따라왔다가 구매했어요"));
        memberDTD.add(new MemberDTD(name,msg));
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //XML 가져오는 메소드


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_main_item, parent, false);


        return new Rowcell(view);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //데이터 셋팅하는 부분
        ((Rowcell)holder).name.setText(memberDTD.get(position).name);
        ((Rowcell)holder).msg.setText(memberDTD.get(position).msg);
    }


    @Override
    public int getItemCount() {
        return memberDTD.size();
    }


    private class Rowcell extends RecyclerView.ViewHolder {
        TextView name, msg;


        public Rowcell(View view) {
            super(view);
            name = (TextView)view.findViewById(R.id.name);
            msg = (TextView)view.findViewById(R.id.msg);
        }
    }
}
