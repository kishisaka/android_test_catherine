package com.example.helloworld;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

public interface MyService {
    @GET("/listitems")
    Call<ItemData> getItems();

    @GET("/setitem/{id}/{data1}/{data2}")
    Call <ItemData> addItemData(@Path("id") long id, @Path("data1") String data1, @Path("data2") String data2);
}
