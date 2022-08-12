package com.chillpt.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chillpt.mall.common.utils.PageUtils;
import com.chillpt.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author chillptX
 * @email chillptX@gmail.com
 * @date 2022-07-14 20:30:28
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

