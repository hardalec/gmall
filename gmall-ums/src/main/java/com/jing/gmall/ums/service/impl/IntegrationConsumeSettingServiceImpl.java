package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.IntegrationConsumeSetting;
import com.jing.gmall.ums.mapper.IntegrationConsumeSettingMapper;
import com.jing.gmall.ums.service.IntegrationConsumeSettingService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 积分消费设置 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class IntegrationConsumeSettingServiceImpl extends ServiceImpl<IntegrationConsumeSettingMapper, IntegrationConsumeSetting> implements IntegrationConsumeSettingService {

}
