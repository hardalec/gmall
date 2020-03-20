package com.jing.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.oms.entity.OrderSetting;
import com.jing.gmall.oms.mapper.OrderSettingMapper;
import com.jing.gmall.oms.service.OrderSettingService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单设置表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting> implements OrderSettingService {

}
