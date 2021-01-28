package com.yan.mall.member.dao;

import com.yan.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author huyan
 * @email xxx
 * @date 2021-01-28 12:28:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
