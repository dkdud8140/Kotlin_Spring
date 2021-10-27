package com.callor.readbook.config

import org.springframework.boot.SpringBootConfiguration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

// 이 클래스는 프로젝트를 실행할 때 실행하라
@SpringBootConfiguration
// 이 프로젝트는 spring Security를 다음과 같이 커스터마이징하여 쓸 것이다.
@EnableWebSecurity
class SecurityConfig:WebSecurityConfigurerAdapter() {

    // ?을 붙이는 이유 : 널포인트익셉션 관리를 넘기는 것
    override fun configure(http: HttpSecurity) {
        // request의 권한을 관리하겠다
        http.authorizeRequests()
            .mvcMatchers("/**")     // request의 모든 요청("/**") 권한을 관리하겠다
            .anonymous()                    //누구나
            .mvcMatchers("/admin")  // request의 요청("/admin") 권한을 관리하겠다
            .fullyAuthenticated()           //인증을 받아라
    }
}