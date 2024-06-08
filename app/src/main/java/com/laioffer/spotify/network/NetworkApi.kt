package com.laioffer.spotify.network

import com.laioffer.spotify.datamodel.Playlist
import com.laioffer.spotify.datamodel.Section
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkApi {
    @GET("feed")
    // promise similar 
    fun getHomeFeed(): Call<List<Section>>

    // get http://0.0.0.0:8080/playlist/1
    @GET("playlist/{id}")
    fun getPlaylist(@Path("id") id: Int): Call<Playlist>
}

