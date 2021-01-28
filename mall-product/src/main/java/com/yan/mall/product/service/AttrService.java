package com.yan.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yan.common.utils.PageUtils;
import com.yan.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author huyan
 * @email xxx
 * @date 2021-01-28 11:02:03
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

