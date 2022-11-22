package app

import app.playground.ConsumeApi
import app.playground.JsonBuilder
import app.playground.UrlConverter
import app.playground.ValidatorPassword

/**
 * Created by Faisal Amir on 29/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

const val LINE_BREAK = "---------------------------------------------"

fun main(args: Array<String>) {
    // TODO write your code here

    doPlayGround(1, "Json Builder") {
        JsonBuilder().run()
    }

    doPlayGround(2, "Consume API") {
        ConsumeApi().run()
    }

    doPlayGround(3, "Url Converter") {
        UrlConverter().run()
    }

    doPlayGround(4, "Validator Password") {
        ValidatorPassword().run()
    }

}

private fun doPlayGround(idx: Int, title: String, run: () -> Unit) {
    val index = if (idx < 10) "0$idx" else idx.toString()
    println("PlayGround - ($index) : $title")
    println(LINE_BREAK)
    run()
    println(LINE_BREAK)
}