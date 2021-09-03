package com.sky.recyclerviewheader.poster;

public class PosterProduct extends Poster {
    private String description;

    public PosterProduct(String posterTitle, String posterLink, int posterImage, String description) {
        super(posterTitle, posterLink, posterImage);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
