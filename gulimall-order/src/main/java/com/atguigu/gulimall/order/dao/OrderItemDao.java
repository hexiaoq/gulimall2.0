package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author hxq
 * @email 156437734
 * @date 2020-11-26 13:15:52
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
