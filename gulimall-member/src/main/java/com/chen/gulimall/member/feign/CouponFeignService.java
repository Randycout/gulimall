package com.chen.gulimall.member.feign;

import com.chen.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    //调用Coupon模块方法
    @RequestMapping("/coupon/coupon/memberCoupon")
    public R membercoupon();
}
