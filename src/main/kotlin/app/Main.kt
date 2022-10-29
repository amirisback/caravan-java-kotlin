package app

import app.playground.JsonBuilder

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

}

private fun doPlayGround(idx: Int, title: String, run: () -> Unit) {
    val index = if (idx < 10) "0$idx" else idx.toString()
    println("PlayGround - ($index) : $title")
    println(LINE_BREAK)
    run()
    println(LINE_BREAK)
}