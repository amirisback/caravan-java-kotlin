package app.playground

import app.core.BasePlayground
import java.util.regex.Pattern

/**
 * Created by Faisal Amir on 22/11/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

class ValidatorPassword : BasePlayground() {

    override fun run() {
        val sample1 = "amiramiramir"
        val sample2 = "amir@sadeqsd"
        val sample3 = "amir123@sadw"
        val sample4 = "amiA123@sadw"
        val sample5 = "amir12"
        val sample6 = "amir2"
        val sample7 = "Amir12"
        val sample8 = "Am@r12"

        onCreate(sample1)
        onCreate(sample2)
        onCreate(sample3)
        onCreate(sample4)
        onCreate(sample5)
        onCreate(sample6)
        onCreate(sample7)

    }

    private fun onCreate(password: String) {
        println("Password $password is Valid Password : ${password.isUsingRegex()}")
    }

    private fun String.isUsingAlphaNumeric(): Boolean {
        val pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6}$")
        val matcher = pattern.matcher(this)
        return matcher.find()
    }

    private fun String.isValidPassword(): Boolean {
        return this.isNotEmpty() && this.isUsingRegex() && this.length >= 8
    }

    private fun String.isUsingRegex(): Boolean {
        val passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"
        val pattern = Pattern.compile(passwordPattern)
        val matcher = pattern.matcher(this)
        return matcher.matches()
    }

}