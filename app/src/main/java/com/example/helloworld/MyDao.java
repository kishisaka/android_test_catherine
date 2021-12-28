package com.example.helloworld;

import java.io.IOException;

import retrofit.Response;
import retrofit.Retrofit;
import retrofit.Call;

public class MyDao {

    private static MyDao myDao = null;

    private MyService service = new Retrofit.Builder().baseUrl("http://192.168.10.147:8081").build().create(MyService.class);

    private MyDao() {
    }

    public static synchronized MyDao getInstance() {
        if (myDao == null) {
            myDao = new MyDao();
        }
        return myDao;
    }

    public ItemData getItems() throws IOException {
        Call<ItemData> call = service.getItems();
        Response<ItemData> data = call.execute();
        return data.body();
    }
}
