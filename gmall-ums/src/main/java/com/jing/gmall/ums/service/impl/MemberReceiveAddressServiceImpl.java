package com.jing.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.ums.entity.MemberReceiveAddress;
import com.jing.gmall.ums.mapper.MemberReceiveAddressMapper;
import com.jing.gmall.ums.service.MemberReceiveAddressService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员收货地址表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressMapper, MemberReceiveAddress> implements MemberReceiveAddressService {

}
