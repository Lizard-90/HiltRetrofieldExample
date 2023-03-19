package com.example.hiltretrofieldexample.network;

import androidx.lifecycle.MutableLiveData;

import com.example.hiltretrofieldexample.models.RecycleList;
import com.example.hiltretrofieldexample.models.RecyclerData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetroRepository {
    private RetrofitServiceInterface retrofitServiceInterface;

    public RetroRepository(RetrofitServiceInterface retrofitServiceInterface) {
        this.retrofitServiceInterface = retrofitServiceInterface;
    }

    public void makeApiCall(String query, MutableLiveData<List<RecyclerData>> mutableLiveData){
        Call<RecycleList> call = retrofitServiceInterface.getDataFromAPI(query);
        call.enqueue(new Callback<RecycleList>() {
            @Override
            public void onResponse(Call<RecycleList> call, Response<RecycleList> response) {
                // send to view
                if(response.isSuccessful()){
                    mutableLiveData.postValue(response.body().getItem());
                }else {
                    mutableLiveData.postValue(null);
                }
            }

            @Override
            public void onFailure(Call<RecycleList> call, Throwable t) {
                    //exception reaction
                mutableLiveData.postValue(null);
            }
        });
    }
}
