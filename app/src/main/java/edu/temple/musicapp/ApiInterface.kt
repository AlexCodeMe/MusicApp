package edu.temple.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

    @Headers(
        "X-RapidAPI-Key: e289f609b2mshec950e9a0ac2f30p1f3a7djsnb01e71579411",
        "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com"
    )
    @GET("/search")
    fun getData(@Query("q") query : String) : Call<MyData>
}