package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.RolePermissionRelation;
import com.jing.gmall.ums.mapper.RolePermissionRelationMapper;
import com.jing.gmall.ums.service.RolePermissionRelationService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 后台用户角色和权限关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class RolePermissionRelationServiceImpl extends ServiceImpl<RolePermissionRelationMapper, RolePermissionRelation> implements RolePermissionRelationService {

}
