package com.laioffer.spotify.datamodel

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity
data class Album(
    @PrimaryKey
    val id: Int,
    @SerializedName("album")
    val name: String,
    val year: String,
    val cover: String,
    val artists: String,
    val description: String
    // all fileds must be serializable
): Serializable {
    // similar to java static function
    companion object {
        fun empty(): Album {
            return Album(
                id = -1,
                "",
                "",
                "",
                "",
                "",
            )
        }
    }
}
