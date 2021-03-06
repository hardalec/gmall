package com.jing.gmall.ums;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jing.gmall.ums.entity.Admin;
import com.jing.gmall.ums.mapper.AdminMapper;
import com.jing.gmall.ums.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class GmallUmsApplicationTests {
    @Autowired
    AdminService adminService;

    @Test
    void contextLoads() {
        Admin admin = adminService.login("admin", "123456");
        System.out.println(admin);
    }

}
