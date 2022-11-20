package app.playground

import app.core.BasePlayground

/**
 * Created by Faisal Amir on 20/11/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

class UrlConverter : BasePlayground()  {

    override fun run() {
        val simpleEmail = "faisal.amir+amir123@gmail.com"
        val urlInput = convertInputBrowser(simpleEmail)
        println(urlInput)
    }

    fun convertInputBrowser(input: String): String {
        return if (input.contains("+")) {
            input.replace("+", "%2B")
        } else if (input.contains(" ")) {
            input.replace(" ", "%20")
        } else if (input.contains("/")) {
            input.replace("/", "%2F")
        } else if (input.contains("?")) {
            input.replace("?", "%3F")
        } else if (input.contains("%")) {
            input.replace("%", "%25")
        } else if (input.contains("#")) {
            input.replace("#", "%23")
        } else if (input.contains("&")) {
            input.replace("&", "%26")
        } else if (input.contains("=")) {
            input.replace("=", "%3D")
        } else {
            input
        }
    }



}