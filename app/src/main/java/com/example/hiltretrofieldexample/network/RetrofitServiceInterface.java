package com.example.hiltretrofieldexample.network;

import com.example.hiltretrofieldexample.models.RecycleList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitServiceInterface {
    @GET("repositories")
    Call<RecycleList> getDataFromAPI(@Query("q") String query);
}
