package com.example.hiltretrofieldexample.models;

public class Owner {
    private String avatar_URL;

    public Owner(String avatar_URL) {
        this.avatar_URL = avatar_URL;
    }

    public String getAvatar_URL() {
        return avatar_URL;
    }

    public void setAvatar_URL(String avatar_URL) {
        this.avatar_URL = avatar_URL;
    }
}
