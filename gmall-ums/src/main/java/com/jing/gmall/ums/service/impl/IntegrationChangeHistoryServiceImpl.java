package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.IntegrationChangeHistory;
import com.jing.gmall.ums.mapper.IntegrationChangeHistoryMapper;
import com.jing.gmall.ums.service.IntegrationChangeHistoryService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 积分变化历史记录表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryMapper, IntegrationChangeHistory> implements IntegrationChangeHistoryService {

}
