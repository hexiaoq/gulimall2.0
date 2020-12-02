package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hxq
 * @email 156437734
 * @date 2020-11-26 12:22:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
