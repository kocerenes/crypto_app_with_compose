package com.example.cryptoappwithcompose.di

import com.example.cryptoappwithcompose.data.remote.ApiFactory
import com.example.cryptoappwithcompose.data.repository.CryptoRepository
import com.example.cryptoappwithcompose.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideConverterFactory(): GsonConverterFactory{
        return GsonConverterFactory.create()
    }

    @Singleton
    @Provides
    fun provideRetrofitAPI(
        gsonConverterFactory: GsonConverterFactory
    ): Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(gsonConverterFactory)
            .baseUrl(BASE_URL)
            .build()
    }

    @Singleton
    @Provides
    fun provideApiFactory(
        retrofit: Retrofit
    ): ApiFactory {
        return retrofit.create(ApiFactory::class.java)
    }

    @Singleton
    @Provides
    fun provideCryptoRepository(
        apiFactory: ApiFactory
    ) = CryptoRepository(apiFactory)

}