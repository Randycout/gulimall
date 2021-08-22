package com.chen.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.common.utils.PageUtils;
import com.chen.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenZhibin
 * @email 2891651056@qq.com
 * @date 2021-07-08 22:29:00
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

