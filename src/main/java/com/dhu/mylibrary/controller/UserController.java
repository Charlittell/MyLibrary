package com.dhu.mylibrary.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dhu.mylibrary.entity.User;
import com.dhu.mylibrary.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
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
    @GetMapping("index")
    public ModelAndView index(){
        ModelAndView mv =new ModelAndView("index");
        return mv;
    }
    @GetMapping("login")
    public ModelAndView login(){
        ModelAndView mv =new ModelAndView("login");
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("userName","杨长辉");
        wrapper.eq("password","123456");

        mv.addObject("user",service.getOne(wrapper));
        return mv;
    }
    @GetMapping("pass")
    public ModelAndView pass(){
        ModelAndView mv =new ModelAndView("pass");
        return mv;
    }
    @GetMapping("personnew")
    public ModelAndView person(){
        ModelAndView mv =new ModelAndView("personnew");
        return mv;
    }


}
