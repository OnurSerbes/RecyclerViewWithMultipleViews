package com.sky.recyclerviewheader.ProductTest;

import com.sky.recyclerviewheader.poster.Header;
import com.sky.recyclerviewheader.poster.Poster;

public class TimelineItem {

    private Header headerItem;
    private Poster posterItem;
    private int viewType;

    public TimelineItem(Header headerItem) {
        this.headerItem = headerItem;
        viewType = RecyclerViewAdapter.ITEM_HEADER_VIEWTYPE;
    }

    public TimelineItem(Poster posterItem) {
        this.posterItem = posterItem;
        viewType = RecyclerViewAdapter.ITEM_POSTER_VIEWTYPE;
    }

    public Header getHeaderItem() {
        return headerItem;
    }

    public void setHeaderItem(Header headerItem) {
        this.headerItem = headerItem;
    }

    public Poster getPosterItem() {
        return posterItem;
    }

    public void setPosterItem(Poster posterItem) {
        this.posterItem = posterItem;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }
}
