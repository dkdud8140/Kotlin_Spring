package com.callor.spring.repository

import com.callor.spring.models.Buyer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

//@Repository
interface BuyerRepository:JpaRepository<Buyer,String> {

    fun findByName(name:String):Array<Buyer>;
    fun findByTel(Tel:String):Array<Buyer>

}