package com.yan.mall.coupon.test;

import com.yan.common.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huyan on 2021/1/30.
 * TIME: 15:39
 * DESC:
 */
@RefreshScope
@RestController
@RequestMapping("/nacos")
public class NacosConfigController {

    @Value("${coupon.user.name}")
    private String userName;
    @Value("${coupon.user.age}")
    private Integer age;

    @Value("${member.user.name}")
    private String memberUserName;
    @Value("${member.user.age}")
    private Integer memberUserAge;

    @GetMapping("/config/test/coupon")
    public R testConfig() {
        return R.ok().put("userName", userName).put("age", age);
    }

    @GetMapping("/config/test/member")
    public R member() {
        return R.ok().put("userName", memberUserName).put("age", memberUserAge);
    }
}
