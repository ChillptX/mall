package com.chillpt.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chillpt.mall.common.utils.PageUtils;
import com.chillpt.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author chillptX
 * @email chillptX@gmail.com
 * @date 2022-07-14 20:30:28
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

