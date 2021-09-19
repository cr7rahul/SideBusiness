package com.solutionsmax.movienews.remote

import com.solutionsmax.movienews.utils.Constants.Companion.MOVIE_BASE_URL
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    val networkModule = module {
        factory { provideRetrofit(get()) }
    }

    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder().baseUrl(MOVIE_BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }


}