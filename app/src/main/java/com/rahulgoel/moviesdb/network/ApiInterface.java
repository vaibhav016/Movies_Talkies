package com.rahulgoel.moviesdb.network;

import com.rahulgoel.moviesdb.Movie_Detail.Movie_result;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by vaibhav singh on 3/27/2016.
 */
public interface ApiInterface {
    @GET("movie/top_rated")
    Call<Movie_result> getTopRated(@Query("api_key") String api_key);

    @GET("movie/upcoming")
    Call<Movie_result> getUpcoming(@Query("api_key") String api_key);

    @GET("movie/popular")
    Call<Movie_result> getPopular(@Query("api_key") String api_key);

    @GET("movie/now_playing")
    Call<Movie_result> getNowPlaying(@Query("api_key") String api_key);

//    https://api.themoviedb.org/3/search/keyword?api_key=c6c78d348b8d5ac03cf81336bb11f651&query=dawn

    @GET("search/movie")
    Call<Movie_result> getResult(@Query("api_key") String api_key, @Query("query") String query);

}
