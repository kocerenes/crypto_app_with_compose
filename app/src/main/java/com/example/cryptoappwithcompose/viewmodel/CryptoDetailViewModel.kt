package com.example.cryptoappwithcompose.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cryptoappwithcompose.data.remote.model.Crypto
import com.example.cryptoappwithcompose.data.repository.CryptoRepository
import com.example.cryptoappwithcompose.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
): ViewModel() {

    suspend fun getCrypto(id: String): Resource<Crypto>{
        return repository.getCrypto(id)
    }

}