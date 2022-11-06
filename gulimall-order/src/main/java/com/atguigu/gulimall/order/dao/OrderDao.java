package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangxinyang
 * @email wxyhugo@gmail.com
 * @date 2022-11-06 10:24:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
