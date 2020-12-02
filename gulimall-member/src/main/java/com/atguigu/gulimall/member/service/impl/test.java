package com.atguigu.gulimall.member.service.impl;

import com.atguigu.common.utils.R;
import com.atguigu.gulimall.member.feign.test1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class test {
    test1 service;

    public R get()
    {
       return service.getcoupon();
    }
}
