package app.util

/**
 * Created by Faisal Amir on 29/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

object Func {

    // TODO Create Function Here

    const val LINE_BREAK = "---------------------------------------------"

    fun doPlayGround(idx: Int, title: String, run: () -> Unit) {
        val index = if (idx < 10) "0$idx" else idx.toString()
        println("PlayGround - ($index) : $title")
        println(LINE_BREAK)
        run()
        println(LINE_BREAK)
    }

}