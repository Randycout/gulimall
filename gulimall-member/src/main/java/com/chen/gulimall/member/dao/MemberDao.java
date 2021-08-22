package com.chen.gulimall.member.dao;

import com.chen.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenZhibin
 * @email 2891651056@qq.com
 * @date 2021-07-08 22:23:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
