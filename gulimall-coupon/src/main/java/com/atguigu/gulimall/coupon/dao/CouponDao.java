package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hxq
 * @email 156437734
 * @date 2020-11-26 14:29:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
