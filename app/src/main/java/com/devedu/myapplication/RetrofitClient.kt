package com.devedu.myapplication

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


////singleton e retrofit padrão
class RetrofitClient private constructor (){

    companion object {

        private lateinit var retrofit:Retrofit
        private val baseurl = "https://jsonplaceholder.typicode.com/" // tem sempre que por / no final dos http

            private fun getRetrofitInstance ():Retrofit{
                val httpClient = OkHttpClient.Builder()
            if (!::retrofit.isInitialized){
                retrofit= Retrofit.Builder()
                    .baseUrl(baseurl)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
                return retrofit
            }
        // esse <S>  é para falar que é generico para pegar qualquer url sem ter que definir nada especifico
fun <S> createService(serviceClass: Class<S>):S{
   return getRetrofitInstance().create(serviceClass)
}
    }
}