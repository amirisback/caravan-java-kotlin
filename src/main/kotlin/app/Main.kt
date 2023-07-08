package app

import app.playground.ConsumeApi
import app.playground.JsonBuilder
import app.playground.UrlConverter
import app.playground.ValidatorPassword
import app.util.Func.doPlayGround

/**
 * Created by Faisal Amir on 29/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */



fun main(args: Array<String>) {

    // TODO write your code here

    doPlayGround(1, "Consume API") {
        ConsumeApi().run()
    }

    doPlayGround(2, "Url Converter") {
        UrlConverter().run()
    }

    doPlayGround(3, "Validator Password") {
        ValidatorPassword().run()
    }

}
