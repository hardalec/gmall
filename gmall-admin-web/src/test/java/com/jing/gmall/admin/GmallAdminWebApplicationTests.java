package com.jing.gmall.admin;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jing.gmall.ums.entity.Admin;
import com.jing.gmall.ums.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallAdminWebApplicationTests {
    @Reference
    AdminService adminService;

    @Test
    void contextLoads() {
//        Admin admin = adminService.login("admin", "123456");
//        System.out.println(admin);
        Admin byId = adminService.getById(1);
        System.out.println(byId);
    }

}
