package com.yan.mall.member.test;

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

    @Value("${member.user.name}")
    private String userName;
    @Value("${member.user.age}")
    private Integer age;


    @GetMapping("/config/test")
    public R testConfig() {
        return R.ok().put("userName", userName).put("age", age);
    }

}
