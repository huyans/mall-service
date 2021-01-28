package com.yan.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yan.common.utils.PageUtils;
import com.yan.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author huyan
 * @email xxx
 * @date 2021-01-28 12:36:26
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

