package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.Role;
import com.jing.gmall.ums.mapper.RoleMapper;
import com.jing.gmall.ums.service.RoleService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
