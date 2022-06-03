package com.plcoding.stockmarketapp.data.remote


import com.plcoding.stockmarketapp.BuildConfig
import com.plcoding.stockmarketapp.data.remote.StockApi.Companion.API_KEY
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query


interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String = API_KEY
    ): ResponseBody

    companion object {
        //APIkey is free and just for learning purpose I made it visible
        private const val API_KEY = "WI231GMUXYUBG9KY"
        const val BASE_URL = "https://alphavantage.co"
    }
}