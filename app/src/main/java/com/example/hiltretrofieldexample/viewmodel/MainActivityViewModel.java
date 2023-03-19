package com.example.hiltretrofieldexample.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hiltretrofieldexample.models.RecyclerData;
import com.example.hiltretrofieldexample.network.RetroRepository;
import com.example.hiltretrofieldexample.network.RetrofitServiceInterface;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainActivityViewModel extends ViewModel {

    MutableLiveData<List<RecyclerData>> liveData;

    @Inject
    RetrofitServiceInterface retrofitServiceInterface;

    @Inject
    public MainActivityViewModel() {
        this.liveData = new MutableLiveData<>();
    }

    public MutableLiveData<List<RecyclerData>> getLiveData() {
        return liveData;
    }

    public void mainCall(){
        RetroRepository retroRepository = new RetroRepository(retrofitServiceInterface);
        retroRepository.makeApiCall("hilt", liveData);
    }
}
