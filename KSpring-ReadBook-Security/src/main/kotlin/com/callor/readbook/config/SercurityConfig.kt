package com.callor.readbook.config

import org.springframework.boot.SpringBootConfiguration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@SpringBootConfiguration
@EnableWebSecurity
class SercurityConfig:WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity) {


        http.authorizeRequests()
            .antMatchers("/member/mypage").authenticated()
            .antMatchers("/**").permitAll()


    }
}