package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.MemberTag;
import com.jing.gmall.ums.mapper.MemberTagMapper;
import com.jing.gmall.ums.service.MemberTagService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户标签表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class MemberTagServiceImpl extends ServiceImpl<MemberTagMapper, MemberTag> implements MemberTagService {

}
