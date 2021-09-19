package com.solutionsmax.movienews.remote

import com.solutionsmax.movienews.movie.data.MovieResultListItem
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApiInterface {

    @GET("4/list/{list_id}")
    suspend fun retrieveMovieList(
        @Path("list_id") list_id: Int,
        @Query("page") page: Int,
        @Query("api_key") api_key: String
    ): MovieResultListItem
}