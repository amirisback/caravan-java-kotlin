package app.playground

import app.api.ApiService
import app.model.BaseModel
import app.model.Server
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Faisal Amir on 30/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

class ConsumeApi {

    companion object {
        const val BASE_URL = "https://amirisback.github.io/"
        const val END_POINT = "caravan-kotlin/api/v1/server.json"
    }

    private fun createApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
    }

    fun getServer() {

        createApiService().getServer().enqueue(object: Callback<BaseModel<List<Server>>>{
            override fun onResponse(call: Call<BaseModel<List<Server>>>, response: Response<BaseModel<List<Server>>>) {
                println(response.body()?.data)
            }

            override fun onFailure(call: Call<BaseModel<List<Server>>>, t: Throwable) {

            }
        })
    }

}