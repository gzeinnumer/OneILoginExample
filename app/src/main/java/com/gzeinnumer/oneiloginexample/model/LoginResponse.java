package com.gzeinnumer.oneiloginexample.model;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("data")
    private LoginDataResponse data;

    @SerializedName("message")
    private String message;

    @SerializedName("status")
    private boolean status;

    @SerializedName("token")
    private String token;

    public void setData(LoginDataResponse data) {
        this.data = data;
    }

    public LoginDataResponse getData() {
        return data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "data=" + data +
                ", message='" + message + '\'' +
                ", status=" + status +
                ", token='" + token + '\'' +
                '}';
    }
}