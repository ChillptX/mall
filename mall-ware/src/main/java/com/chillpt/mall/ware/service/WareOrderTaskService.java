package com.chillpt.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chillpt.mall.common.utils.PageUtils;
import com.chillpt.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author chillptX
 * @email chillptX@gmail.com
 * @date 2022-07-14 20:35:31
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

