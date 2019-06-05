package com.dhu.mylibrary.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dhu.mylibrary.entity.Book;
import com.dhu.mylibrary.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @Autowired
    IBookService service;
    @GetMapping("bookdetail")
    public Object bookdetail(){
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("borrowCount");
        return  service.list(wrapper);
    }

}
