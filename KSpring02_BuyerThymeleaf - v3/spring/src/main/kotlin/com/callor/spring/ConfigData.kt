package com.callor.spring

import com.callor.spring.models.Buyer
import kotlin.random.Random

class ConfigData {

    companion object {

        val APP_NAME = "나라상사 고객관리"
        val APP_VERSION = "2021 v.2.0.0"

        val RND = Random(System.currentTimeMillis())
        val BUYER_LIST = arrayOf(
            Buyer(userid = "B001",name="ddd",address = "Seoul", tel="02-111-2222", manager = "ddd", man_tel = "0002000300",buy_total = 1000),
            Buyer(userid = "B002",name="fff",address = "GwangJu", tel="02-111-2222", manager = "lll", man_tel = "0002000300",buy_total = 2000),
            Buyer(userid = "B003",name="uuu",address = "DockDo", tel="02-999-5555", manager = "qqq", man_tel = "000-999-9999",buy_total = 3000),
        )



    }

}