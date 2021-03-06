package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.GrowthChangeHistory;
import com.jing.gmall.ums.mapper.GrowthChangeHistoryMapper;
import com.jing.gmall.ums.service.GrowthChangeHistoryService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 成长值变化历史记录表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryMapper, GrowthChangeHistory> implements GrowthChangeHistoryService {

}
