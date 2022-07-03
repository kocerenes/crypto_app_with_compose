package com.example.cryptoappwithcompose.data.remote

import com.example.cryptoappwithcompose.data.remote.model.Crypto
import com.example.cryptoappwithcompose.data.remote.model.CryptoList
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiFactory {

    //https://api.nomics.com/v1/currencies?key=<Kendi API Anahtarınız>&ids=BTC&attributes=id,name,logo_url

    //https://api.nomics.com/v1/prices?key=<Kendi API Anahtarınız>

    @GET("prices")
    suspend fun getCryptoList(
        @Query("key") key : String
    ): CryptoList

    @GET("currencies")
    suspend fun getCrypto(
        @Query("key") key : String,
        @Query("ids") id : String,
        @Query("attributes") attributes : String
    ): Crypto

}