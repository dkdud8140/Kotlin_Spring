package com.callor.spring.config

import com.callor.spring.ConfigData
import com.callor.spring.models.Sales
import com.callor.spring.repository.SalesRepository
import org.jboss.logging.Logger
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringBootConfiguration
import org.springframework.context.annotation.Bean
import java.text.SimpleDateFormat
import java.util.*

@SpringBootConfiguration
class SalesDataInit(val saleDao:SalesRepository) {

    private val pnames = listOf(
        "아이폰미니", "캘럭시폴드Z3","캘럭시플립Z3","갤럭시버즈","갤럭시워치"
    )

    val logger = Logger.getLogger(SalesDataInit::class.java)

    @Bean
    fun DataInit():CommandLineRunner {

        for(num in 1..19) {
            salesDataInit()
        }

        return CommandLineRunner {
            logger.debug("Sales Data complete!")
        }
    }

    fun salesDataInit() {

        val userid = String.format("B%03d",ConfigData.RND.nextInt(10) +1)
        val pname = pnames[ConfigData.RND.nextInt(pnames.size)]

        val qty = ConfigData.RND.nextInt(10)+10 * 10
        val price = ConfigData.RND.nextInt(100) +100 * 100

        val df = SimpleDateFormat("yyyy-MM-dd")
        val dt = SimpleDateFormat("hh:mm:ss")

        val toDate = df.format(Date())
        val toTime = dt.format(Date())

        val sales = Sales(
            userid=userid,
            pname=pname,
            qty=qty,
            amt=price,
            total=qty*price,
            date = toDate,
            time = toTime,
        )

        saleDao.save(sales)
    }
}