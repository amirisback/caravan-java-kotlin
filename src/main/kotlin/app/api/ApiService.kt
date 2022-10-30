package app.api

import app.model.BaseModel
import app.model.Server
import app.playground.ConsumeApi
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Faisal Amir on 30/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

interface ApiService {

    @GET(ConsumeApi.END_POINT)
    fun getServer(): Call<BaseModel<List<Server>>>

}