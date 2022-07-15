package com.chillpt.mall.ware.dao;

import com.chillpt.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chillptX
 * @email chillptX@gmail.com
 * @date 2022-07-14 20:35:31
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
