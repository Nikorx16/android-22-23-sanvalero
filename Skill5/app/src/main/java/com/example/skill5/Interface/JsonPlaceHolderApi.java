package com.example.skill5.Interface;

import android.telecom.Call;

import com.example.skill5.model.Posts;

import java.util.List;

import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
 @GET("posts")
    Call<List<Posts>> getPosts();
}
