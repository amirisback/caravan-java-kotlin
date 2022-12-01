package app.util

/**
 * Created by Faisal Amir on 01/12/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

fun solution(heroes: List<List<String>>, position: List<Int>, moves: List<String>): String {
    // Your code starts here.

    val LEFT = "left"
    val DOWN = "down"
    val RIGHT = "right"
    val UP = "up"

    var row = position[0]
    var col = position[1]

    for (i in moves.indices) {
        if (moves[i] == LEFT) {
            if (col > 0) {
                col--
            }
        } else if (moves[i] == DOWN) {
            if (row < heroes.size - 1) {
                row++
            }
        } else if (moves[i] == RIGHT) {
            if (col < heroes[row].size - 1) {
                col++
            }
        } else if (moves[i] == UP) {
            if (row > 0) {
                row--
            }
        }
    }

    var chosenHeroes = ""
    val lastMove = moves[moves.size - 1]

    if (heroes[row][col] == "") {
        if (lastMove == LEFT) {
            if (col > 0) {
                col--
                chosenHeroes = heroes[row][col]
            }
        } else if (lastMove == DOWN) {
            if (row < heroes.size - 1) {
                row++
                chosenHeroes = heroes[row][col]
            }
        } else if (lastMove == RIGHT) {
            if (col < heroes[row].size - 1) {
                col++
                chosenHeroes = heroes[row][col]
            }
        } else if (lastMove == UP) {
            if (row > 0) {
                row--
                chosenHeroes = heroes[row][col]
            }
        }
    } else {
        chosenHeroes = heroes[row][col]
    }

    return chosenHeroes
}