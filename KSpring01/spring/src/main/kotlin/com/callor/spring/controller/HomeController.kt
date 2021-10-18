package com.callor.spring.controller

import com.callor.spring.model.Buyer
import com.callor.spring.service.BuyerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HomeController {

    /**
     * BuyerService 인터페이스를 사용하여
     * bSer 객체를 선언하고
     * Spring에게 객체주입을 요청하기 위하여 Autowired를 선언했따
     * Kotlin은 절대 null 혹은 없는 값으로 객체,변수 선언 금지
     * 이럴 때는 반드시 lateinit를 부착시켜야한다
     *          == 나중에 초기화하겠다.
     */
    @Autowired
    private lateinit var bSer : BuyerService

    @ResponseBody
    @RequestMapping(value=["/"],method = [RequestMethod.GET])
    fun home():String {
        return "My Kotlin Spring Project"
    }

    @RequestMapping(value = ["/hello"],method=[RequestMethod.GET])
    fun hello(model:Model):String {
        model.addAttribute("name", "홍길동이")
        return "hello"
    }

    @ResponseBody
    @RequestMapping(value = ["/list"],method = [RequestMethod.GET])
    fun list() : Array<Buyer> {
        return bSer.selectAll()
    }

    @ResponseBody
    @RequestMapping(value = ["/getuser"],method = [RequestMethod.GET])
    fun getUser() : Buyer {
        return bSer.findById(id="user")
    }
}