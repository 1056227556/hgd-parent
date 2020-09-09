package com.lxjn.hgd.user.service.impl;

import com.lxjn.hgd.user.entity.User;
import com.lxjn.hgd.user.mapper.UserMapper;
import com.lxjn.hgd.user.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
