package com.atguigu.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.atguigu.gulimall.member.dao")
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
public class GulimailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailMemberApplication.class, args);
    }

}
