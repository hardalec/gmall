package com.jing.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jing.gmall.ums.entity.Admin;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author Lfy
 * @since 2019-03-19
 */
public interface AdminService extends IService<Admin> {

    //登陆
    Admin login(String username, String password);

    Admin getUserInfo(String userName);
}
