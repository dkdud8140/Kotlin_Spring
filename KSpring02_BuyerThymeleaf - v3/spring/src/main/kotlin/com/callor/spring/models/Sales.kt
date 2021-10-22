package com.callor.spring.models

import java.util.*
import javax.persistence.*
import kotlin.jvm.Transient

@Entity
@Table(name = "tbl_sales", schema = "naraDB")
data class Sales(

    @Id
    @Column(columnDefinition = "BIGINT" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var seq : Long?=null,
    var userid : String?=null,
    var date : String?=null,
    var time : String?=null,
    var pname : String?=null,
    var qty : Int?=null,
    var amt : Int?=null,
    var total : Int?=null,

    @Transient
    // 데이터에 특별하게 Date(날짜, 시간형) 값을 사용하고 싶을 때
    @Temporal(TemporalType.DATE)
    var data1 : Date?=null,

    @Transient
    @Temporal(TemporalType.TIME)
    var time1 : Date?=null,

    @Transient
    @Temporal(TemporalType.TIMESTAMP)
    var date_time : Date?=null,
    
)
