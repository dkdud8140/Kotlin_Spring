package com.callor.spring.controller

import com.callor.spring.ConfigString
import com.callor.spring.models.Buyer
import com.callor.spring.service.BuyerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*

@Controller
class HomeController {

    @Autowired
    private lateinit var bSer:BuyerService

    @RequestMapping(value = ["/"],method = [RequestMethod.GET])
    fun home(model:Model):String {

        println(ConfigString.APP_NAME)
        println(ConfigString.APP_VERSION)

        val userList = bSer.selectAll()
//        model.addAttribute("USERS",userList)
        model["USERS"] = userList
        return "home"
    }

    @ResponseBody
    @RequestMapping(value=["/list"],method = [RequestMethod.GET])
    fun list():Array<Buyer> {
        return bSer.selectAll()
    }

    @RequestMapping(value=["/detail"],method = [RequestMethod.GET])
    fun detail( @RequestParam("userid")userid:String, model:Model):String {

        val user = bSer.findById(userid)
        model["USER"] = user
        return "detail"
    }

}