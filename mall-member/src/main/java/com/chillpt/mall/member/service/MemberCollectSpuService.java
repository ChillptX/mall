package com.chillpt.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chillpt.mall.common.utils.PageUtils;
import com.chillpt.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author chillptX
 * @email chillptX@gmail.com
 * @date 2022-07-14 20:22:55
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

