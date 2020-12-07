package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.vo.AttrResVo;
import com.atguigu.gulimall.product.vo.AttrVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author hxq
 * @email 156437734
 * @date 2020-11-26 12:22:34
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);


    void saveattr(AttrVo attr);

    PageUtils querybasePage(Map<String, Object> params, long catelogId, String type);



    AttrResVo getattrinfo(Long attrId);
}

