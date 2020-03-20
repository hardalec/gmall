package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.MemberTask;
import com.jing.gmall.ums.mapper.MemberTaskMapper;
import com.jing.gmall.ums.service.MemberTaskService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员任务表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class MemberTaskServiceImpl extends ServiceImpl<MemberTaskMapper, MemberTask> implements MemberTaskService {

}
