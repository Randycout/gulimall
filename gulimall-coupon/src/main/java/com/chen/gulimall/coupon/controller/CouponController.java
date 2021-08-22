package com.chen.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chen.gulimall.coupon.entity.CouponEntity;
import com.chen.gulimall.coupon.service.CouponService;
import com.chen.common.utils.PageUtils;
import com.chen.common.utils.R;



/**
 * 优惠券信息
 *
 * @author chenZhibin
 * @email 2891651056@qq.com
 * @date 2021-06-21 21:16:51
 */
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;
    //测试feign(被调用者)
    @RequestMapping("/memberCoupon")
    public R membercoupon(){
        CouponEntity couponEntity=new CouponEntity();
        couponEntity.setCouponName("满10块立减5块");
        return R.ok().put("coupons",Arrays.asList(couponEntity));
    }
    //测试nacos作为服务注册中心
    @Value("${coupon.user.name}")
    private String name;
    @Value("${coupon.user.age}")
    private String age;
    @RequestMapping("/testNacos")
    public R testNacos(){
        return R.ok().put("name",name).put("age",age);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
  //  @RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
