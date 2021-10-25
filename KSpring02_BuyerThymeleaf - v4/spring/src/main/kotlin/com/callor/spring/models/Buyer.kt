package com.callor.spring.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="tbl_buyer", schema="naraDB")
data class Buyer(
    // primary Key
    @Id
    @Column(columnDefinition = "CHAR(4)",nullable=true, unique = true, name = "userid" )
    var userid : String?= null,

    @Column(columnDefinition = "CHAR(25)",nullable=true )
    var name : String?= null,

    @Column(columnDefinition = "CHAR(25)",nullable=true )
    var tel : String?= null,

    @Column(nullable=true )
    var address : String?= null,

    @Column(columnDefinition = "CHAR(25)",nullable=true )
    var manager : String?= null,

    @Column(columnDefinition = "CHAR(25)",nullable=true )
    var man_tel : String?= null,

    @Column(nullable = true)
    var buy_total :Int?= null,

)
