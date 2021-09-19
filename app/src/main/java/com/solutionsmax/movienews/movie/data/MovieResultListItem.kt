package com.solutionsmax.movienews.movie.data

import com.google.gson.annotations.SerializedName

data class MovieResultListItem(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("page")
    val page: Int,
    @SerializedName("poster_path")
    val poster_path: String,
    @SerializedName("results")
    val results: List<MovieListItem>,
    @SerializedName("total_pages")
    val total_pages: Int,
    @SerializedName("total_results")
    val total_results: Int
)