package com.lxjn.hgd.user.service.impl;

import com.lxjn.hgd.user.entity.Blog;
import com.lxjn.hgd.user.mapper.BlogMapper;
import com.lxjn.hgd.user.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
