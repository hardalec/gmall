package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.MemberMemberTagRelation;
import com.jing.gmall.ums.mapper.MemberMemberTagRelationMapper;
import com.jing.gmall.ums.service.MemberMemberTagRelationService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户和标签关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class MemberMemberTagRelationServiceImpl extends ServiceImpl<MemberMemberTagRelationMapper, MemberMemberTagRelation> implements MemberMemberTagRelationService {

}
