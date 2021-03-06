package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.MemberLoginLog;
import com.jing.gmall.ums.mapper.MemberLoginLogMapper;
import com.jing.gmall.ums.service.MemberLoginLogService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员登录记录 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogMapper, MemberLoginLog> implements MemberLoginLogService {

}
