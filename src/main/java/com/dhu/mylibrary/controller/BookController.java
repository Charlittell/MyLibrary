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
@RequestMapping("/book")
public class BookController {
    @GetMapping("tableproject")
    public ModelAndView tableproject(){
        ModelAndView mv =new ModelAndView("tableproject");
        return mv;
    }

}
