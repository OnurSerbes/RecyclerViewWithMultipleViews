package com.sky.recyclerviewheader.ProductTest;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sky.recyclerviewheader.R;

import java.util.List;

public class TimelineAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private Context mContext;
    private List<TimelineItem> mData;

    public TimelineAdapter(Context context, List<TimelineItem> data) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType){

            case (Constant.ITEM_HEADER_VIEWTYPE):
                view = LayoutInflater.from(mContext).inflate(R.layout.header_layout,parent,false);
                return new PostHeaderViewHolder(view);
            case(Constant.ITEM_POSTER_VIEWTYPE):
                view = LayoutInflater.from(mContext).inflate(R.layout.cardview_item,parent,false);
                return new PostPosterViewHolder(view);

            default:throw new IllegalArgumentException();

        }

    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {

        holder.setData(mData.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return mData.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        if(mData !=null){
            return mData.size();
        }else{
            return 0;
        }

    }
}
