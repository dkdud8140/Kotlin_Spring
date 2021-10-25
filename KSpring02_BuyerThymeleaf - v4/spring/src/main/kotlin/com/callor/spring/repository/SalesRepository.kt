package com.callor.spring.repository

import com.callor.spring.models.Sales
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SalesRepository:JpaRepository<Sales,Long> {

    fun findByPname(pName:String) : Array<Sales>
    fun findByUserid(userid:String):Array<Sales>
}