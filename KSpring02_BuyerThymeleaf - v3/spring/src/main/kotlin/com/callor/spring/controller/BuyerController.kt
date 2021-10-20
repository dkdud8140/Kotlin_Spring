package com.callor.spring.controller

import com.callor.spring.ConfigData
import com.callor.spring.models.Buyer
import com.callor.spring.service.BuyerService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping(value = ["/buyer"])
class BuyerController(val bSer:BuyerService) {

     @RequestMapping(value=["/list"],method=[RequestMethod.GET])
//   == @GetMapping(name="/list")
    fun list(model:Model):String {
        val buyerList = bSer.selectAll();
        model["BUYERS"] = buyerList
        return "buyer/list"
    }


    @RequestMapping(value=["/detail"],method = [RequestMethod.GET])
    fun detail(@RequestParam("userid")userid:String, model:Model):String {

        val user = bSer.findById(userid)
        model["USER"] = user
        return "buyer/detail"
    }

    @ResponseBody
    @RequestMapping(value = ["/insert"],method = [RequestMethod.POST])
    fun insert(): Buyer {
        var insertBuyer = ConfigData.BUYER_LIST[0]
        bSer.insert(insertBuyer);
        return insertBuyer;
    }


    @RequestMapping(value = ["/write"],method = [RequestMethod.GET])
    fun write(): String {
        return "buyer/write"
    }

    }