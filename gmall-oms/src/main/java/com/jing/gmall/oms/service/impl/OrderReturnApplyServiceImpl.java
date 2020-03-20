package com.jing.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.oms.entity.OrderReturnApply;
import com.jing.gmall.oms.mapper.OrderReturnApplyMapper;
import com.jing.gmall.oms.service.OrderReturnApplyService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单退货申请 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyMapper, OrderReturnApply> implements OrderReturnApplyService {

}
