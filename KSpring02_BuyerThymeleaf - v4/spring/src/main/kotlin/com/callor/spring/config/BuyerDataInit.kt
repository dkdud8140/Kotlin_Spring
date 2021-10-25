package com.callor.spring.config

import com.callor.spring.ConfigData
import com.callor.spring.models.Buyer
import com.callor.spring.repository.BuyerRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringBootConfiguration
import org.springframework.context.annotation.Bean

@SpringBootConfiguration
class BuyerDataInit {

    private val logger = LoggerFactory.getLogger(BuyerDataInit::class.java)
    @Autowired
    private lateinit var bDao:BuyerRepository

    val names = listOf("이수만","카리나","지젤","닝닝","윈터")

//    @Bean
//    @org.springframework.transaction.annotation.Transactional
    fun initData(): CommandLineRunner {
        return CommandLineRunner {
            for(num in 1..10) {

                val userId = String.format("B%03d",num);
                val tel1 = ConfigData.RND.nextInt(1000) +1 ;
                val tel2 = ConfigData.RND.nextInt(1000) +1 ;
                val tel3 = ConfigData.RND.nextInt(1000) +1 ;
                val tel4 = ConfigData.RND.nextInt(1000) +1 ;
                val nums1 =ConfigData.RND.nextInt(names.size) ;
                val nums2 = ConfigData.RND.nextInt(names.size) ;

                val buyer = Buyer();
                buyer.userid = userId;
                buyer.name = names[nums1]
                buyer.manager = names[nums2]

                buyer.tel = String.format("010-%04d-%04d",tel1,tel2)
                buyer.man_tel = String.format("010-%04d-%04d",tel3,tel4)

                logger.debug(buyer.toString())
                bDao.save(buyer);
            }
        }

    }
}