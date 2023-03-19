package com.example.hiltretrofieldexample.di;

import com.example.hiltretrofieldexample.network.RetrofitServiceInterface;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class AppModel {
    String baseURL = "https://api.github.com/search/"; // repositorie?q=network


    @Singleton
    @Provides
    public RetrofitServiceInterface getRetroRerviceInteface(Retrofit retrofit){
        return retrofit.create(RetrofitServiceInterface.class);
    }

    @Singleton
    @Provides
    public Retrofit getRetroInstance(){
        return new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
