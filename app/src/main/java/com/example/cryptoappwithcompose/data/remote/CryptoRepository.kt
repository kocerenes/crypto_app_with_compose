package com.example.cryptoappwithcompose.data.remote

import com.example.cryptoappwithcompose.data.remote.model.Crypto
import com.example.cryptoappwithcompose.data.remote.model.CryptoList
import com.example.cryptoappwithcompose.utils.Resource

interface CryptoRepository {

    suspend fun getCryptoList() : Resource<CryptoList>
    suspend fun getCrypto(id: String): Resource<Crypto>

}