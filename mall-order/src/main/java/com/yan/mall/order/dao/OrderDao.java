package com.yan.mall.order.dao;

import com.yan.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author huyan
 * @email xxx
 * @date 2021-01-28 12:36:26
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
