package com.dhu.mylibrary.service;

import com.dhu.mylibrary.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
public interface IUserService extends IService<User> {
    public void changePass(String newpass,Integer userId);
    public void signup (String userName,String password);
}
