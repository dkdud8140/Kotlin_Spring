package com.callor.spring.impl

import com.callor.spring.models.Buyer
import com.callor.spring.service.BuyerService
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service("bSerV1")
class BuyerServiceImplV1:BuyerService {

    private companion object {
        val RND = Random(System.currentTimeMillis())
        val BUYER_LIST = arrayOf(
                Buyer(userid = "B001",name="ddd",address = "Seoul", tel="02-111-2222", manager = "ddd", man_tel = "0002000300",buy_total = 1000),
                Buyer(userid = "B002",name="fff",address = "GwangJu", tel="02-111-2222", manager = "lll", man_tel = "0002000300",buy_total = 2000),
                Buyer(userid = "B003",name="uuu",address = "DockDo", tel="02-999-5555", manager = "qqq", man_tel = "000-999-9999",buy_total = 3000),
                )
    }

    override fun selectAll(): Array<Buyer> {
        return BUYER_LIST
    }

    override fun findById(userid: String): Buyer {
        val findUser = BUYER_LIST.filter {buyer-> buyer.userid == userid}
        return findUser[0]
    }

    override fun findByName(name: String): Array<Buyer> {
        val userNum = RND.nextInt(BUYER_LIST.size)
        return arrayOf(BUYER_LIST[userNum])
    }

    override fun findByTel(name: String): Array<Buyer> {
        TODO("Not yet implemented")
    }

    override fun insert(buyer: Buyer): Int {
        TODO("Not yet implemented")
    }

    override fun delete(userid: String): Int {
        TODO("Not yet implemented")
    }

    override fun update(buyer: Buyer): Int {
        TODO("Not yet implemented")
    }
}