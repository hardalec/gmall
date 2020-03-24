package com.jing.gmall.pms;

import com.jing.gmall.pms.entity.Brand;
import com.jing.gmall.pms.entity.Product;
import com.jing.gmall.pms.service.BrandService;
import com.jing.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;


@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;
    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        Product byId = productService.getById(1);
        System.out.println(byId.getName());
    }

    @Test
    public void setRedisTemplate(){
        redisTemplate.opsForValue().set("k2", "v2");
        String k1 = redisTemplate.opsForValue().get("k2");
        System.out.println(k1);
    }
}
