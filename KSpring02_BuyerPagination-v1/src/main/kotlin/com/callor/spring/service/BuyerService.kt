package com.callor.spring.service

import com.callor.spring.models.Buyer
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface BuyerService {

    fun selectAll(): Array<Buyer>
    fun selectAll(pageable: Pageable): Page<Buyer>

    fun findById(userid: String): Buyer
    fun findByName(name: String): Array<Buyer>
    fun findByTel(name: String): Array<Buyer>

    fun insert(buyer: Buyer): Buyer
    fun insert():Buyer

    fun delete(userid: String)
    fun update(buyer: Buyer): Buyer
    fun selectWithPageable(intPage: Int): Array<Buyer>


}