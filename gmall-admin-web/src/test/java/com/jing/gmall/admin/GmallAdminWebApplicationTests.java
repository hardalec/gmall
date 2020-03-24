package com.jing.gmall.admin;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jing.gmall.pms.entity.Product;
import com.jing.gmall.pms.service.ProductService;
import com.jing.gmall.ums.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallAdminWebApplicationTests {
    @Reference
    AdminService adminService;
    @Reference
    ProductService productService;

    @Test
    void contextLoads() {
//        Admin byId = adminService.getById(1);
//        System.out.println(byId);
        Product byId = productService.getById(1);
        System.out.println(byId);
    }

}
