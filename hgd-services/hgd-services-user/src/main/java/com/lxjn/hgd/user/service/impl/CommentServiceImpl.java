package com.lxjn.hgd.user.service.impl;

import com.lxjn.hgd.user.entity.Comment;
import com.lxjn.hgd.user.mapper.CommentMapper;
import com.lxjn.hgd.user.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lxjn
 * @since 2020-09-09
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
