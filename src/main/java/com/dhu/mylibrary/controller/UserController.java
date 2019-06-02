package com.dhu.mylibrary.controller;


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
