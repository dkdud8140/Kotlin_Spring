package com.callor.spring.impl

import com.callor.spring.ConfigData
import com.callor.spring.models.Buyer
import com.callor.spring.repository.BuyerRepository
import com.callor.spring.service.BuyerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service("bSerV1")
class BuyerServiceImplV1(val bRepo: BuyerRepository):BuyerService {

    @Autowired
    private lateinit var bDao : BuyerRepository ;

    override fun selectAll(): Array<Buyer> {
        return bDao.findAll().toTypedArray()
    }

    override fun findById(userid: String): Buyer {
        //        val findUser = ConfigData.BUYER_LIST.filter { buyer-> buyer.userid == userid }
        //val buyer = bRepo.findById(userid).orElse(null)
//        return buyer;
        val buyer = bRepo.findById(userid)
        return buyer.get()
    }

    override fun findByName(name: String): Array<Buyer> {
        return bRepo.findByName(name)
    }

    override fun findByTel(tel: String): Array<Buyer> {
        return bRepo.findByTel(tel)
    }

    override fun insert(buyer: Buyer): Buyer {
        return bDao.save(buyer);
    }

    override fun delete(userid: String){
        bRepo.deleteById(userid)
    }

    override fun update(buyer: Buyer): Buyer {
        TODO("Not yet implemented")
    }
}