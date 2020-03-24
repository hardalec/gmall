package com.jing.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.pms.entity.Product;
import com.jing.gmall.pms.mapper.ProductMapper;
import com.jing.gmall.pms.service.ProductService;
import com.jing.gmall.vo.PageInfoVo;
import com.jing.gmall.vo.productvo.PmsProductQueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum) {

        QueryWrapper<Product> wrapper = new QueryWrapper<>();
        if(productQueryParam.getBrandId() != null)
            wrapper.eq("brand_id", productQueryParam.getBrandId());
        if(!StringUtils.isEmpty(productQueryParam.getKeyword()))
            wrapper.like("name", productQueryParam.getKeyword());
        if(productQueryParam.getProductCategoryId() != null)
            wrapper.eq("product_category_id", productQueryParam.getProductCategoryId());
        if(!StringUtils.isEmpty(productQueryParam.getProductSn()))
            wrapper.like("product_sn", productQueryParam.getProductSn());
        if(productQueryParam.getPublishStatus() != null)
            wrapper.eq("publish_status", productQueryParam.getPublishStatus());
        if(productQueryParam.getVerifyStatus() != null)
            wrapper.eq("verify_status", productQueryParam.getVerifyStatus());

        IPage<Product> iPage = productMapper.selectPage(new Page<Product>(pageNum.longValue(), pageSize.longValue()), wrapper);
        PageInfoVo pageInfoVo = new PageInfoVo(iPage.getTotal(),iPage.getPages(),pageSize.longValue(),iPage.getRecords(),pageNum);
        return pageInfoVo;
    }
}
