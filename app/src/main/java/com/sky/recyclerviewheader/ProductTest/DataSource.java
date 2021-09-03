package com.sky.recyclerviewheader.ProductTest;

import com.sky.recyclerviewheader.R;
import com.sky.recyclerviewheader.poster.Header;
import com.sky.recyclerviewheader.poster.Poster;
import com.sky.recyclerviewheader.poster.PosterMovies;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static List<TimelineItem> getTimeLineData(){

        List<TimelineItem> combinedList = new ArrayList<>();

        List<TimelineItem> movieList = new ArrayList<>();

        Header itemHeaderMovies = new Header("Movies", R.drawable.dof_logo);
        TimelineItem headerMovies = new TimelineItem(itemHeaderMovies);

        Poster itemPosterMovies = new PosterMovies("Astrocop","this is link",R.drawable.astrocop);
        TimelineItem posterMovies = new TimelineItem(itemPosterMovies);

        Poster itemPosterMoviesTwo = new PosterMovies("Astrocop","this is link",R.drawable.astrocop);
        TimelineItem posterMoviesTwo = new TimelineItem(itemPosterMoviesTwo);

        movieList.add(headerMovies);
        movieList.add(posterMovies);
        movieList.add(posterMoviesTwo);



        List<TimelineItem> productList = new ArrayList<>();

        Header itemHeaderProduct = new Header("Product", R.drawable.dof_logo);
        TimelineItem headerProduct = new TimelineItem(itemHeaderProduct);

        Poster itemPosterProduct = new PosterMovies("Other post","this is link",R.drawable.astrocop);
        TimelineItem posterProduct = new TimelineItem(itemPosterProduct);

        Poster itemPosterProductTwo = new PosterMovies("Hello","this is link",R.drawable.astrocop);
        TimelineItem posterProductTwo = new TimelineItem(itemPosterProductTwo);

        movieList.add(headerProduct);
        movieList.add(posterProduct);
        movieList.add(posterProductTwo);

        combinedList.addAll(movieList);
        combinedList.addAll(productList);


        return combinedList;

    }
}
