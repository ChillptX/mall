package com.chillpt.mall.coupon.dao;

import com.chillpt.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chillptX
 * @email chillptX@gmail.com
 * @date 2022-07-14 20:16:56
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
