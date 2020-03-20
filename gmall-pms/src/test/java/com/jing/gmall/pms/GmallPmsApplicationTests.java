package com.jing.gmall.pms;

import com.jing.gmall.pms.entity.Brand;
import com.jing.gmall.pms.entity.Product;
import com.jing.gmall.pms.service.BrandService;
import com.jing.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        Product byId = productService.getById(1);
        System.out.println(byId.getName());

//        Brand brand = new Brand();
//        brand.setName("nihao");
//        brandService.save(brand);
//        System.out.println("陈工公共哦你弄i你离开那里");
    }

}
