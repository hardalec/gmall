package com.jing.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.oms.entity.CartItem;
import com.jing.gmall.oms.mapper.CartItemMapper;
import com.jing.gmall.oms.service.CartItemService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
