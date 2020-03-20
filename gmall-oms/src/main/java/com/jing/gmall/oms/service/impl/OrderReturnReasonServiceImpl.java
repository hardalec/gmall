package com.jing.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.oms.entity.OrderReturnReason;
import com.jing.gmall.oms.mapper.OrderReturnReasonMapper;
import com.jing.gmall.oms.service.OrderReturnReasonService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 退货原因表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReason> implements OrderReturnReasonService {

}
