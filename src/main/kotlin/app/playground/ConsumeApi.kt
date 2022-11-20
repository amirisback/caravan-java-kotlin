package app.playground

import app.api.ApiService
import app.core.BasePlayground
import app.model.BaseModel
import app.model.Server
import com.frogobox.coresdk.ext.doApiRequest
import com.frogobox.coresdk.response.FrogoDataResponse
import com.frogobox.coresdk.source.FrogoApiClient

/**
 * Created by Faisal Amir on 30/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

class ConsumeApi : BasePlayground() {

    override fun run() {

        createApiService().getServer().doApiRequest(null, object : FrogoDataResponse<BaseModel<List<Server>>> {
            override fun onFailed(statusCode: Int, errorMessage: String) {
                println("onFailed")
            }

            override fun onFinish() {
                println("onFinish")
            }

            override fun onHideProgress() {
                println("onHideProgress")
            }

            override fun onShowProgress() {
                println("onShowProgress")
            }

            override fun onSuccess(data: BaseModel<List<Server>>) {
                println("onSuccess : $data")
            }
        }) {
            println("Disposable")
        }

    }

    companion object {
        const val BASE_URL = "https://amirisback.github.io/"
        const val END_POINT = "caravan-kotlin/api/v1/server.json"
    }

    private fun createApiService(): ApiService {
        return FrogoApiClient.create(BASE_URL)
    }

}