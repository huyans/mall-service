package com.yan.mall.product.dao;

import com.yan.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author huyan
 * @email xxx
 * @date 2021-01-28 11:02:03
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
