package com.chillpt.mall.product.dao;

import com.chillpt.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author chillptX
 * @email chillptX@gmail.com
 * @date 2022-07-14 16:11:58
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
