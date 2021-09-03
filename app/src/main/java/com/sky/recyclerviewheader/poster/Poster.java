package com.sky.recyclerviewheader.poster;

public class Poster  {
    private String posterTitle;
    private String posterLink;
    private int posterImage;


    public Poster(){

    }

    public Poster(String posterTitle, String posterLink, int posterImage) {
        this.posterTitle = posterTitle;
        this.posterLink = posterLink;
        this.posterImage = posterImage;
    }

    public String getPosterTitle() {
        return posterTitle;
    }

    public void setPosterTitle(String posterTitle) {
        this.posterTitle = posterTitle;
    }

    public String getPosterLink() {
        return posterLink;
    }

    public void setPosterLink(String posterLink) {
        this.posterLink = posterLink;
    }

    public int getPosterImage() {
        return posterImage;
    }

    public void setPosterImage(int posterImage) {
        this.posterImage = posterImage;
    }
}
