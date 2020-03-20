package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.AdminRoleRelation;
import com.jing.gmall.ums.mapper.AdminRoleRelationMapper;
import com.jing.gmall.ums.service.AdminRoleRelationService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 后台用户和角色关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class AdminRoleRelationServiceImpl extends ServiceImpl<AdminRoleRelationMapper, AdminRoleRelation> implements AdminRoleRelationService {

}
