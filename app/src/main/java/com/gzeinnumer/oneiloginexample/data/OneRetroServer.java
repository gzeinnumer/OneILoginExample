package com.gzeinnumer.oneiloginexample.data;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OneRetroServer {


    public static final String base_url = "https://talentpool.oneindonesia.id/api/";

    private static Retrofit setInit(Context applicationContext) {
        OkHttpClient client = new OneTokenInterceptor().getClient(applicationContext);
        return new Retrofit
                .Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
                .build();
    }

    public static OneApiRequest getInstance(Context applicationContext) {
        return setInit(applicationContext).create(OneApiRequest.class);
    }
}
