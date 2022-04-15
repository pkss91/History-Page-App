package com.example.listview;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/ring/event")
    Call<TestItem> getData();

}