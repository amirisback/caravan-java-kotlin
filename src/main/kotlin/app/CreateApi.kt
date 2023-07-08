package app

import app.playground.JsonBuilder
import app.util.Func.doPlayGround

fun main(args: Array<String>) {
    // TODO write your code here

    doPlayGround(1, "Json Builder") {
        JsonBuilder().run()
    }

}