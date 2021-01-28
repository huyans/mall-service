package com.yan.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yan.common.utils.PageUtils;
import com.yan.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author huyan
 * @email xxx
 * @date 2021-01-28 12:28:49
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

