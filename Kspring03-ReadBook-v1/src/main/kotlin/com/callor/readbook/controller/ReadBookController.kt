package com.callor.readbook.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@RequestMapping(value = ["/read"])
@Controller
class ReadBookController {

    @RequestMapping(value = ["/insert"],method = [RequestMethod.GET])
    fun insert():String {
        return "read/write"
    }
}