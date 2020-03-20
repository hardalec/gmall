package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.Admin;
import com.jing.gmall.ums.mapper.AdminMapper;
import com.jing.gmall.ums.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public Admin login(String username, String password) {
        //Spring自带的md5工具类
        String digest = DigestUtils.md5DigestAsHex(password.getBytes());
        QueryWrapper<Admin> wrapper = new QueryWrapper<Admin>().eq("username", username).eq("username", username);
        Admin admin = adminMapper.selectOne(wrapper);
        return admin;
    }

    @Override
    public Admin getUserInfo(String userName) {
        return adminMapper.selectOne(new QueryWrapper<Admin>().eq("username", userName));
    }
}
