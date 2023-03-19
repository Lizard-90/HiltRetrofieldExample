package com.example.hiltretrofieldexample.models;

import java.util.List;

public class RecycleList {
    private List<RecyclerData> item;

    public RecycleList(List<RecyclerData> item) {
        this.item = item;
    }

    public List<RecyclerData> getItem() {
        return item;
    }

    public void setItem(List<RecyclerData> item) {
        this.item = item;
    }
}
