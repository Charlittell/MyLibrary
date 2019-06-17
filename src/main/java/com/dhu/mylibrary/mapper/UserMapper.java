package com.dhu.mylibrary.mapper;

import com.dhu.mylibrary.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import javax.validation.constraints.NotNull;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 修改密码
    **/
    @Update("update user set password=#{newpass} where userId = #{userId}")
    public void changePass(@NotNull String newpass, @NotNull Integer userId);
    /**
     * 注册
     * */
    @Select(value = "call createUserInfo(#{userName},#{password})")
    public void signup(String userName,String password);
}
