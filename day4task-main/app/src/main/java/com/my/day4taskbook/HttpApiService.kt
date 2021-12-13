package com.my.day4taskbook

import retrofit2.http.GET
import retrofit2.Call

interface HttpApiService {

    @GET("/books")
    suspend fun getBookDetails():List<AuthorResult>

}