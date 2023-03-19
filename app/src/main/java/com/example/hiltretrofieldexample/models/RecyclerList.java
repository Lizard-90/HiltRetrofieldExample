package com.example.hiltretrofieldexample.models;

import java.util.List;

public class RecyclerList {
    private List<RecyclerData> items;

    public RecyclerList(List<RecyclerData> items) {
        this.items = items;
    }

    public List<RecyclerData> getItems() {
        return items;
    }

    public void setItems(List<RecyclerData> items) {
        this.items = items;
    }

    //    public RecyclerList(List<RecyclerData> item) {
//        this.item = item;
//    }
//
//    public List<RecyclerData> getItems() {
//        return item;
//    }
//
//    public void setItem(List<RecyclerData> item) {
//        this.item = item;
//    }
}
