package com.callor.spring.models

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "tbl_sales", schema = "naraDB")
data class Sales(

    @Id
    @Column(columnDefinition = "BIGINT" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var seq : Long,
    var data : String,
    var time : String,
    var pname : String,
    var qty : String,
    var amt : Int,
    var total : Int,
    
    // 데이터에 특별하게 Date(날짜, 시간형) 값을 사용하고 싶을 때
    @Temporal(TemporalType.DATE)
    var data1 : Date,

    @Temporal(TemporalType.TIME)
    var time1 : Date,

    @Temporal(TemporalType.TIMESTAMP)
    var date_time : Date
    
)
