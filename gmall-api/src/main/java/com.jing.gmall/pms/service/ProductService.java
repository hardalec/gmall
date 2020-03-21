package com.jing.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jing.gmall.pms.entity.Product;
import com.jing.gmall.vo.PageInfoVo;
import com.jing.gmall.vo.productvo.PmsProductQueryParam;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
public interface ProductService extends IService<Product> {

    PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum);
}
