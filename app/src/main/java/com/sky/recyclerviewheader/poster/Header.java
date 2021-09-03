package com.sky.recyclerviewheader.poster;

public class Header {
    private String headerText;
    private int headerImage;

    public Header(){

    }

    public Header(String headerText, int headerImage) {
        this.headerText = headerText;
        this.headerImage = headerImage;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public int getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(int headerImage) {
        this.headerImage = headerImage;
    }
}
