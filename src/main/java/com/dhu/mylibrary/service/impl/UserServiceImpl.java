package com.dhu.mylibrary.service.impl;

import com.dhu.mylibrary.entity.User;
import com.dhu.mylibrary.mapper.UserMapper;
import com.dhu.mylibrary.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
