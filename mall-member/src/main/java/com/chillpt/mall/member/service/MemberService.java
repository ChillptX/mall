package com.chillpt.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chillpt.mall.common.utils.PageUtils;
import com.chillpt.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author chillptX
 * @email chillptX@gmail.com
 * @date 2022-07-14 20:22:55
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

