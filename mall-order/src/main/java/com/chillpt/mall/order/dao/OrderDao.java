package com.chillpt.mall.order.dao;

import com.chillpt.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chillptX
 * @email chillptX@gmail.com
 * @date 2022-07-14 20:30:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
