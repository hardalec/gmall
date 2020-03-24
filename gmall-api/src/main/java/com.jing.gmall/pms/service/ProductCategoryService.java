package com.jing.gmall.pms.service;

import com.jing.gmall.pms.entity.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jing.gmall.vo.PageInfoVo;
import com.jing.gmall.vo.productvo.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
public interface ProductCategoryService extends IService<ProductCategory> {
    List<PmsProductCategoryWithChildrenItem> listCategoryWithChilden(Integer i);
}
