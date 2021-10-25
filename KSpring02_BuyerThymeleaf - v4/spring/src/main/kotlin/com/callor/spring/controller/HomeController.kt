package com.callor.spring.controller

import com.callor.spring.ConfigData
import com.callor.spring.impl.BuyerServiceImplV1
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

        println(ConfigData.APP_NAME)
        println(ConfigData.APP_VERSION)

//        val userList = bSer.selectAll()
////        model.addAttribute("USERS",userList)
//        model["USERS"] = userList
        return "redirect:/buyer/list"
    }

    @ResponseBody
    @RequestMapping(value=["/list"],method = [RequestMethod.GET])
    fun list():Array<Buyer> {
        return bSer.selectAll()
    }


}