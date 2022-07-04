package com.example.cryptoappwithcompose.data.remote

import com.example.cryptoappwithcompose.data.remote.model.Crypto
import com.example.cryptoappwithcompose.data.remote.model.CryptoList
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiFactory {

    //https://api.nomics.com/v1/currencies?key=<Kendi API Anahtarınız>&ids=BTC&attributes=id,name,logo_url

    //https://api.nomics.com/v1/prices?key=<Kendi API Anahtarınız>

    @GET("https://raw.githubusercontent.com/atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json")
    suspend fun getCryptoList(): CryptoList

    @GET("https://raw.githubusercontent.com/atilsamancioglu/IA32-CryptoComposeData/main/crypto.json")
    suspend fun getCrypto(): Crypto

}