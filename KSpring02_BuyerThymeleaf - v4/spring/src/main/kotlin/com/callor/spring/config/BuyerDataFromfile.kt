package com.callor.spring.config

import org.hibernate.annotations.common.util.impl.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringBootConfiguration
import org.springframework.context.annotation.Bean

@SpringBootConfiguration
class BuyerDataFromfile {

    @Value("\${com.calloer.spring.student-file}")
    private val dataFile : String? = null

    private val logger = org.slf4j.LoggerFactory.getLogger(BuyerDataFromfile::class.java)

    @Bean
    fun dataFromfile():CommandLineRunner {
        logger.debug("Data File : {}", dataFile)
        return CommandLineRunner {  }
    }
}