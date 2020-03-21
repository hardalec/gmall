package com.jing.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
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
        IPage<Product> iPage = productMapper.selectPage(new Page<Product>(pageNum.longValue(), pageSize.longValue()), null);
        PageInfoVo pageInfoVo = new PageInfoVo(iPage.getTotal(),iPage.getPages(),pageSize.longValue(),iPage.getRecords(),pageNum);
        return pageInfoVo;
    }
}
