package com.flab.jsdelivery.src;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration  // 해당 클래스의 인스턴스를 이용해서 설정파일을 대신합니다
@EnableWebSecurity  // Securiry를 활성화
public class WebSecurityConfig {

    @Bean
    protected SecurityFilterChain filterChain (HttpSecurity http) throws Exception {
        http.csrf().disable();
        return http.build();
    }
}