package com.gzeinnumer.oneiloginexample.data;

import com.gzeinnumer.oneiloginexample.model.LoginResponse;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface OneApiRequest {

    @FormUrlEncoded
    @POST("user/login")
    Call<LoginResponse> login(@Field("username") String username, @Field("password") String password);
}
