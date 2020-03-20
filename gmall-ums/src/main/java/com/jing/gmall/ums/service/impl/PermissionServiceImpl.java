package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.Permission;
import com.jing.gmall.ums.mapper.PermissionMapper;
import com.jing.gmall.ums.service.PermissionService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
