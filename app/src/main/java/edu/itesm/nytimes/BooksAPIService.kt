package edu.itesm.nytimes

import retrofit2.Response
import retrofit2.http.GET


interface APIService {
    @GET("hardcover-fiction.json?api-key=z5sxANzJsnBGbCGpejuFMtYXhvUSbWzZ")
    suspend fun getBooks() : Response<Results>
}