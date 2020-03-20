package com.jing.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.oms.entity.Order;
import com.jing.gmall.oms.mapper.OrderMapper;
import com.jing.gmall.oms.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
