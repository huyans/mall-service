package com.yan.mall.product.dao;

import com.yan.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author huyan
 * @email xxx
 * @date 2021-01-28 11:02:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
