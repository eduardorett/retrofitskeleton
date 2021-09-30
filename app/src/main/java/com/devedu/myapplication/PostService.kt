package com.devedu.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface PostService {

    @GET("posts") // pega a url do banco virtual
fun list():Call<List<PostModel>> // conecta com os ids do model

}