package com.dhu.mylibrary.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dhu.mylibrary.entity.Favor;
import com.dhu.mylibrary.service.IFavorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huihui
 * @since 2019-06-02
 */
@RestController
@RequestMapping("/favor")
public class FavorController {
    @Autowired
    IFavorService service;

    @PostMapping("addfavor")
    public Integer addFavor(Integer bookId,Integer readerId){
        return service.addFavor(bookId,readerId);
    }

    @PostMapping("query")
    public Favor query(Integer bookId, Integer readerId){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("bookId",bookId);
        wrapper.eq("readerId",readerId);
        return service.getOne(wrapper);
    }
    @PostMapping("removefavor")
    public Object removeFavor(Integer favorId){
        return service.removeById(favorId);
    }

    @PostMapping("getfavor")
    public Object getfavor(Integer readerId){
      return service.getFavor(readerId);
    }
}
