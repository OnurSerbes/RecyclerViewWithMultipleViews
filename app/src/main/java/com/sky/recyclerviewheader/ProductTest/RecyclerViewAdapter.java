package com.sky.recyclerviewheader.ProductTest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.sky.recyclerviewheader.R;
import com.sky.recyclerviewheader.poster.Header;
import com.sky.recyclerviewheader.poster.Poster;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    public static final int ITEM_HEADER_VIEWTYPE = 0;
    public static final int ITEM_POSTER_VIEWTYPE = 1;

    public  Context mContext;
    public  List<TimelineItem> mData;

    public RecyclerViewAdapter(Context context, List<TimelineItem> data) {
        mContext = context;
        mData = data;
    }



    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == ITEM_HEADER_VIEWTYPE) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_layout, parent, false);
            return  new PostHeaderViewHolder(v);

        }else if(viewType == ITEM_POSTER_VIEWTYPE) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item, parent, false);
            return new PostPosterViewHolder(v);

        }
        throw new RuntimeException("there is no type that matches the type " + viewType + " + make sure your using types correctly");
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.setData(mData.get(position));
    }

    @Override
    public int getItemCount() {
        if(mData !=null){
            return mData.size();
        }else{
            return 0;
        }
    }

    public class PostHeaderViewHolder extends BaseViewHolder {

        private TextView headerText;
        private ImageView headerImage;

        public PostHeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            headerText = (TextView) itemView.findViewById(R.id.headerText);
            headerImage = (ImageView) itemView.findViewById(R.id.headerImage);
        }

        @Override
        void setData(TimelineItem item) {

            Header header = item.getHeaderItem();
            headerText.setText(header.getHeaderText());
            headerImage.setImageResource(header.getHeaderImage());

        }
    }

    public class PostPosterViewHolder extends BaseViewHolder {

        private TextView textPosterTitle;
        private ImageView posterImageView;
        private CardView cardView;

        public PostPosterViewHolder(@NonNull View itemView) {
            super(itemView);

            textPosterTitle = (TextView) itemView.findViewById(R.id.poster_title_id);
            posterImageView = (ImageView) itemView.findViewById(R.id.poster_image_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    System.out.println("the " + getAdapterPosition() + ". "+" item has clicked");


                }
            });
        }

        @Override
        void setData(TimelineItem item) {

            Poster poster = item.getPosterItem();
            textPosterTitle.setText(poster.getPosterTitle());
            posterImageView.setImageResource(poster.getPosterImage());
            cardView = itemView.findViewById(R.id.cardview_id);



        }
    }
}
