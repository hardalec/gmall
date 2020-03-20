package com.jing.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jing.gmall.pms.entity.CommentReplay;
import com.jing.gmall.pms.mapper.CommentReplayMapper;
import com.jing.gmall.pms.service.CommentReplayService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 产品评价回复表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-19
 */
@Service
@Component
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayMapper, CommentReplay> implements CommentReplayService {

}
