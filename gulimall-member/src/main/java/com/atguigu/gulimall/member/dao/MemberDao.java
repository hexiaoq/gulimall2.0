package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hxq
 * @email 156437734
 * @date 2020-11-26 14:24:38
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
