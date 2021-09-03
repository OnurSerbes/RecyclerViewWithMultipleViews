package com.sky.recyclerviewheader.ProductTest;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
;
import com.sky.recyclerviewheader.R;
import com.sky.recyclerviewheader.poster.Header;

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
