package com.dhu.mylibrary.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dhu.mylibrary.entity.User;
import com.dhu.mylibrary.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService service;
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
//    @GetMapping("index")
//    public ModelAndView index(){
//        ModelAndView mv =new ModelAndView("index");
//        return mv;
//    }
//    @GetMapping("login")
//    public ModelAndView login(){
//        ModelAndView mv =new ModelAndView("login");
//        return mv;
//    }
//    @PostMapping("login")
//    public ModelAndView login_post(String username,String password){
//        ModelAndView mv =new ModelAndView("login");
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.eq("userName",username);
//        wrapper.eq("password",password);
//        User user = service.getOne(wrapper);
//        if(user != null){
//            mv.setViewName("index");
//        }
//        return mv;
//    }


    @PostMapping("login")
    @ResponseBody
    public User login(@Param("stuno") String stuno,@Param("password") String password){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("userName",stuno);
        wrapper.eq("password",password);
        System.out.println(stuno+password);
        User user = service.getOne(wrapper);
        System.out.println(user);

        return user;
    }
//    @GetMapping("pass")
//    public ModelAndView pass(){
//        ModelAndView mv =new ModelAndView("pass");
//        return mv;
//    }
//    @GetMapping("personnew")
//    public ModelAndView person(){
//        ModelAndView mv =new ModelAndView("personnew");
//        return mv;
//    }
    @PostMapping("changepass")
    public String changePass(String newpass,Integer userId){
        service.changePass(newpass,userId);
        return "true";
    }

    @PostMapping("signup")
    public String  signup(String userName,String password)
    {
        service.signup(userName,password);
        return "true";
    }

    @GetMapping("showuser")
    public Object  showUser()
    {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.le("authority",50);
      return service.list(wrapper);
    }

    @PostMapping("deleteuser")
    public boolean deleteUser(@RequestBody User user){

        return service.removeById(user.getUserId());
    }

    @PostMapping("usersearch")
    public Object userSearch(@RequestBody User user){
        QueryWrapper wrapper =new QueryWrapper();
        if(user.getUserId() != null){
            wrapper.eq("userId",user.getUserId());
        }
        else{
            wrapper.eq("userName",user.getUserName());
        }

        return service.list(wrapper);
    }
    @PostMapping("addadmin")
    public Object addAdmin(@RequestBody User user){
        user.setAuthority(99);
        service.updateById(user);
        return null;
    }

}
