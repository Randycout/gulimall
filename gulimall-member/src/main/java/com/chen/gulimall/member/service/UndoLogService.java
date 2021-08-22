package com.chen.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.common.utils.PageUtils;
import com.chen.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenZhibin
 * @email 2891651056@qq.com
 * @date 2021-07-08 22:23:53
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

