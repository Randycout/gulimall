package com.chen.gulimall.order.dao;

import com.chen.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenZhibin
 * @email 2891651056@qq.com
 * @date 2021-07-08 22:29:00
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
