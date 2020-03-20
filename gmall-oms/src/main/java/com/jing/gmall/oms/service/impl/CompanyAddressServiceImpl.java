package com.jing.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.oms.entity.CompanyAddress;
import com.jing.gmall.oms.mapper.CompanyAddressMapper;
import com.jing.gmall.oms.service.CompanyAddressService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 公司收发货地址表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class CompanyAddressServiceImpl extends ServiceImpl<CompanyAddressMapper, CompanyAddress> implements CompanyAddressService {

}
