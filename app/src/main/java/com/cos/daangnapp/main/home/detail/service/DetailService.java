package com.cos.daangnapp.main.home.detail.service;

import com.cos.daangnapp.CMRespDto;
import com.cos.daangnapp.main.home.model.PostRespDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface DetailService {

    @GET("post/{id}")
    Call<CMRespDto<PostRespDto>> getpost(@Path("id")int id);

    @POST("post/{postId}/{userId}")
    Call<CMRespDto<PostRespDto>> getlike(@Path("postId")int postId, @Path("userId")int userId);
}
