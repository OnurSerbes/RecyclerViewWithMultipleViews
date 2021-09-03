package com.sky.recyclerviewheader.ProductTest;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

import com.sky.recyclerviewheader.R;
import com.sky.recyclerviewheader.poster.Poster;

public class PostPosterViewHolder extends BaseViewHolder{

    private TextView textPosterTitle;
    private ImageView posterImageView;
    private CardView cardView;

    public PostPosterViewHolder(@NonNull View itemView) {
        super(itemView);

        textPosterTitle = (TextView) itemView.findViewById(R.id.poster_title_id);
        posterImageView = (ImageView) itemView.findViewById(R.id.poster_image_id);
        cardView = (CardView) itemView.findViewById(R.id.cardview_id);

    }

    @Override
    void setData(TimelineItem item) {

        Poster poster = item.getPosterItem();
        textPosterTitle.setText(poster.getPosterTitle());
        posterImageView.setImageResource(poster.getPosterImage());
        cardView = itemView.findViewById(R.id.cardview_id);



    }
}
