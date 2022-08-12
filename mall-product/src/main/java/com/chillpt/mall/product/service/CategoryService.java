package com.chillpt.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chillpt.mall.common.utils.PageUtils;
import com.chillpt.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author chillptX
 * @email chillptX@gmail.com
 * @date 2022-07-14 16:11:58
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void removeMenuByIds(List<Long> asList);

    List<CategoryEntity> listWithTree();
}