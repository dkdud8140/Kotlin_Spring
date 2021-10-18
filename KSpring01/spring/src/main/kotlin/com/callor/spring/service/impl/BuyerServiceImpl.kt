package com.callor.spring.service.impl

import com.callor.spring.model.Buyer
import com.callor.spring.service.BuyerService
import org.springframework.stereotype.Service
import kotlin.random.Random

/**
 * BuyerService interface를 implement하여 클래스 선언
 */
@Service
class BuyerServiceImpl:BuyerService {

    /**
     * kotlin 클래스 내에서 선언되며
     * 클래스가 작동되는데 필요한 필수 데이터나
     * 어떤 옵션을 초기화 하는 초기화 블럭 객체
     */
    companion object {

        val rnd = Random(System.currentTimeMillis())

        //map 데이터 생성하기
        val name = Pair("name", "홍길동")
        val id = Pair("id", "user")
        val age = Pair("age", 30)

        /**
         * Buyer DTO를 사용하여 3명의 데이터를 선언하고
         * List 배열로 생성하였다.
         */
        val userList = arrayOf(
            Buyer(id="admin",name="admin",age=30),
            Buyer(id="user",name="홍길동",age=22),
            Buyer(id="guest",name="이몽룡",age=18),
        )
    }


    override fun selectAll():Array<Buyer> {
        return userList
    }

    override fun findById(id: String):Buyer {

        val num = rnd.nextInt(userList.size)
        return userList[num]
    }
}