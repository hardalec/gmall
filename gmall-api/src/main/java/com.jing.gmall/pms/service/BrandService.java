package com.jing.gmall.pms.service;

import com.jing.gmall.pms.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jing.gmall.vo.PageInfoVo;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
public interface BrandService extends IService<Brand> {

    PageInfoVo productPageInfo(String keyword, Integer pageNum, Integer pageSize);
}
