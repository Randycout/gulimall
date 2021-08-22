package com.chen.gulimall.product.dao;

import com.chen.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenZhibin
 * @email sunlightcs@gmail.com
 * @date 2021-06-17 01:13:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}