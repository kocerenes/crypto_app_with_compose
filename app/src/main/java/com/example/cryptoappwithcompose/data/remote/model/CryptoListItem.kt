package com.example.cryptoappwithcompose.data.remote.model


import com.google.gson.annotations.SerializedName

data class CryptoListItem(
    @SerializedName("currency")
    val currency: String?,
    @SerializedName("price")
    val price: String?
)