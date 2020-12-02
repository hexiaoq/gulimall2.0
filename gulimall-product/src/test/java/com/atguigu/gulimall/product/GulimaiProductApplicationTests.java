package com.atguigu.gulimall.product;


import com.atguigu.gulimall.product.dao.BrandDao;
import com.atguigu.gulimall.product.entity.BrandEntity;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

@SpringBootTest
class GulimaiProductApplicationTests {
    @Resource
    BrandDao brandDao;


    @Test
    void contextLoads() {
        BrandEntity b=new BrandEntity();
        b.setName("huawei");
        brandDao.insert(b);
        System.out.println(brandDao.selectById(1));
    }

}
