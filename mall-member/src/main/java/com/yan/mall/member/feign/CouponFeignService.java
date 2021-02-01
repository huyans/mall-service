package com.yan.mall.member.feign;

import com.yan.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by huyan on 2021/1/30.
 * TIME: 15:20
 * DESC:
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    R getCouponsByMemeber();
}
