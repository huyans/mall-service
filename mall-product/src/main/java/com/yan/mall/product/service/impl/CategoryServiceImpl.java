package com.yan.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yan.common.utils.PageUtils;
import com.yan.common.utils.Query;

import com.yan.mall.product.dao.CategoryDao;
import com.yan.mall.product.entity.CategoryEntity;
import com.yan.mall.product.service.CategoryService;
import org.springframework.transaction.annotation.Transactional;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> getCategoryTreeList() {
        List<CategoryEntity> allCategoryList = baseMapper.selectList(null);

        List<CategoryEntity> categoryTreeList = allCategoryList.stream().filter(categoryEntity -> {
            //筛选出一级菜单
            return categoryEntity.getParentCid() == 0;
        }).map((menu) -> {
            //递归构造树型结构
            menu.setChildCategoryList(getChildrens(menu, allCategoryList));
            return menu;
        }).sorted((preMenu, afterMenu) -> {
            //排序
            return preMenu.getSort().compareTo(afterMenu.getSort());
        }).collect(Collectors.toList());


        return categoryTreeList;

    }

    @Override
    @Transactional
    public void batchRemoveByIdList(List<Long> categoryIdList) {
        //TODO 检查当前要删除的菜单，在别的地方是否引用

        baseMapper.deleteBatchIds(categoryIdList);

    }

    private List<CategoryEntity> getChildrens(CategoryEntity parent, List<CategoryEntity> allList) {
        return allList.stream().filter(son -> {
            return son.getParentCid().longValue() == parent.getCatId();
        }).map(son -> {
            son.setChildCategoryList(getChildrens(son, allList));
            return son;
        }).collect(Collectors.toList());
    }

}