package com.hashimshafiq.moviedemo.data.local.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Entity(tableName = "movies")
data class MovieEntity(
        @Expose
        @PrimaryKey
        val id: String,

        @Expose
        val vote_average: Double,

        @Expose
        val poster_path: String,

        @Expose
        val title: String,

        @Expose
        val overview: String,

        @Expose
        val releaseDate: String
) {}



