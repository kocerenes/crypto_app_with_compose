package com.example.cryptoappwithcompose.data.repository

import com.example.cryptoappwithcompose.data.remote.ApiFactory
import com.example.cryptoappwithcompose.data.remote.CryptoRepository
import com.example.cryptoappwithcompose.data.remote.model.Crypto
import com.example.cryptoappwithcompose.data.remote.model.CryptoList
import com.example.cryptoappwithcompose.utils.Constants.API_KEY
import com.example.cryptoappwithcompose.utils.Constants.ATTRIBUTES
import com.example.cryptoappwithcompose.utils.Resource
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

class CryptoRepository @Inject constructor(
    private val apiFactory: ApiFactory
): CryptoRepository {

    override suspend fun getCryptoList(): Resource<CryptoList> {
        val response = try {
            apiFactory.getCryptoList(API_KEY)
        }catch (exception: Exception){
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }

    override suspend fun getCrypto(id: String): Resource<Crypto> {
        val response = try {
            apiFactory.getCrypto(API_KEY,id, ATTRIBUTES)
        }catch (exception: Exception){
            return Resource.Error(exception.toString())
        }
        return Resource.Success(response)
    }


}