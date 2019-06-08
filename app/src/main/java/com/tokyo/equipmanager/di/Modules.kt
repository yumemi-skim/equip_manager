package com.tokyo.equipmanager.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.tokyo.equipmanager.api.ApiService
import com.tokyo.equipmanager.ui.AppConst
import okhttp3.OkHttpClient
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private val appModule = module {
    single<Moshi> {
        Moshi.Builder().add(KotlinJsonAdapterFactory())
                .build()
    }
}

private val apiModule = module {
    factory<ApiService> { createApi(get("api"), get()) }
}

private val viewModelModule = module {
}

private val repositoryModule = module {

}

private inline fun <reified T> createApi(okHttpClient:OkHttpClient, moshi: Moshi):T{
    return Retrofit.Builder()
            .baseUrl(AppConst.MOCK_URL)
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(T::class.java)
}


object Module{
    val modules = listOf(appModule, viewModelModule, repositoryModule, apiModule)
}