package com.callor.spring.impl

import com.callor.spring.ConfigData
import com.callor.spring.models.Buyer
import com.callor.spring.repository.BuyerRepository
import com.callor.spring.service.BuyerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service("bSerV1")
class BuyerServiceImplV1:BuyerService {

    @Autowired
    private lateinit var bDao : BuyerRepository ;

    override fun selectAll(): Array<Buyer> {
        return ConfigData.BUYER_LIST
    }

    override fun findById(userid: String): Buyer {
        val findUser = ConfigData.BUYER_LIST.filter {buyer-> buyer.userid == userid}
        return findUser[0]
    }

    override fun findByName(name: String): Array<Buyer> {
        val userNum = ConfigData.RND.nextInt(ConfigData.BUYER_LIST.size)
        return arrayOf(ConfigData.BUYER_LIST[userNum])
    }

    override fun findByTel(name: String): Array<Buyer> {
        TODO("Not yet implemented")
    }

    override fun insert(buyer: Buyer): Buyer {
        return bDao.save(buyer);
    }

    override fun delete(userid: String): Buyer {
        TODO("Not yet implemented")
    }

    override fun update(buyer: Buyer): Buyer {
        TODO("Not yet implemented")
    }
}