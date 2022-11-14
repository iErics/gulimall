package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wxy
 */
@FeignClient("gulimall-coupon")
public interface CouponFeign {
    /**
     * 这是一个声明式的远程调用
     * 获取会员所有优惠券
     * @return
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
