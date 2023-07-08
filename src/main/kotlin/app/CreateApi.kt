package app

import app.playground.JsonBuilder
import app.util.Func.doPlayGround

fun main(args: Array<String>) {

    doPlayGround(1, "Json Builder") {
        JsonBuilder().run()
    }

}