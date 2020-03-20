package com.jing.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.oms.entity.OrderOperateHistory;
import com.jing.gmall.oms.mapper.OrderOperateHistoryMapper;
import com.jing.gmall.oms.service.OrderOperateHistoryService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单操作历史记录 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistory> implements OrderOperateHistoryService {

}
