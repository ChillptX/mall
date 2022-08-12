package com.chillpt.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chillpt.mall.common.utils.PageUtils;
import com.chillpt.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author chillptX
 * @email chillptX@gmail.com
 * @date 2022-07-14 20:16:56
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

