package com.yan.mall.product;

import com.yan.mall.product.entity.BrandEntity;
import com.yan.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by huyan on 2021/1/28.
 * TIME: 11:50
 * DESC:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandTest {

    @Autowired
    private BrandService brandService;

    @Test
    public void saveTest() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("小米...");
        brandService.save(brandEntity);
        System.out.println("success");
    }
}
