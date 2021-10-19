package com.callor.spring.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


// 선언한 엔티티를 기준으로 tbl_buyer라는 테이블을 naraDB라는 스키마에 만들자
@Entity
@Table(name="tbl_buyer",schema="naraDB")
class BuyerEntity {

    // primary Key
    @Id
    @Column(columnDefinition = "CHAR(4)",nullable=false )
    private val userid : String? = null ;

    @Column(columnDefinition = "CHAR(25)",nullable=false )
    private val name : String? = null;

    @Column(columnDefinition = "CHAR(25)",nullable=false )
    private val tel : String? = null;

    @Column(nullable=false )
    private val address : String? = null

    @Column(columnDefinition = "CHAR(25)",nullable=false )
    private val manager : String? = null;

    @Column(columnDefinition = "CHAR(25)",nullable=false )
    private val man_tel : String?= null;

    private val buy_total :Int = 0;
}