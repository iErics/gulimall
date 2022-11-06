package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author wangxinyang
 * @email wxyhugo@gmail.com
 * @date 2022-11-05 19:32:07
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
