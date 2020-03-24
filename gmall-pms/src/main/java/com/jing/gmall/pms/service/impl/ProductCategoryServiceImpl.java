package com.jing.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.constant.SysCacheConstant;
import com.jing.gmall.pms.entity.ProductCategory;
import com.jing.gmall.pms.mapper.ProductCategoryMapper;
import com.jing.gmall.pms.service.ProductCategoryService;
import com.jing.gmall.vo.productvo.PmsProductCategoryWithChildrenItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Slf4j
@Service
@Component
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {
    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Override
    public List<PmsProductCategoryWithChildrenItem> listCategoryWithChilden(Integer i) {
        Object cache = redisTemplate.opsForValue().get(SysCacheConstant.CATEGORY_MENU_CACHE_KEY);
        List<PmsProductCategoryWithChildrenItem> items = null;
        if(cache != null){
            log.debug("woshi tianccai");
            items = (List<PmsProductCategoryWithChildrenItem>) cache;
        } else {
             items = productCategoryMapper.listCategoryWithChilden(i);
            redisTemplate.opsForValue().set(SysCacheConstant.CATEGORY_MENU_CACHE_KEY, items);
        }
        return items;
    }
}
