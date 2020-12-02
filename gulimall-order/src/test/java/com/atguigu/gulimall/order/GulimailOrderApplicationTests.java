package com.atguigu.gulimall.order;

import com.atguigu.gulimall.order.dao.OrderDao;
import com.atguigu.gulimall.order.entity.OrderEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimailOrderApplicationTests {
    @Resource
    OrderDao orderdao;

    @Test
    void contextLoads() {
       OrderEntity orderEntity= new OrderEntity();
       orderEntity.setMemberId(1l);
       orderdao.insert(orderEntity);
        System.out.println(orderdao.selectById(1l));

    }

}
