package com.callor.readbook.model


import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="tbl_book",schema = "naraDB")
data class Book(

    @Id
    @Column(columnDefinition = "CHAR(10)")
    var isbn : String? = null,

    var title : String? = null,
    var comp : String? = null,
    var author : String? = null,
    var price : Int? = null,

)
