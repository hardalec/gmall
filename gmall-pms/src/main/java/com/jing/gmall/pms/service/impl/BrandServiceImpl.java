package com.jing.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.pms.entity.Brand;
import com.jing.gmall.pms.entity.Product;
import com.jing.gmall.pms.mapper.BrandMapper;
import com.jing.gmall.pms.service.BrandService;
import com.jing.gmall.vo.PageInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {
    @Autowired
    BrandMapper brandMapper;
    @Override
    public PageInfoVo productPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        QueryWrapper<Brand> wrapper = new QueryWrapper<Brand>();
        if(!StringUtils.isEmpty(keyword)) wrapper.like("name", keyword);
        IPage<Brand> iPage = brandMapper.selectPage(new Page<Brand>(pageNum.longValue(), pageSize.longValue()), wrapper);
        PageInfoVo pageInfoVo = new PageInfoVo(iPage.getTotal(),iPage.getPages(),pageSize.longValue(),iPage.getRecords(),pageNum);

        return pageInfoVo;
    }
}
