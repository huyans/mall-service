package com.yan.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yan.common.utils.PageUtils;
import com.yan.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author huyan
 * @email xxx
 * @date 2021-01-28 11:02:03
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

