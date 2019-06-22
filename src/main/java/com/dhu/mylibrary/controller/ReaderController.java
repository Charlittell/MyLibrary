package com.dhu.mylibrary.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dhu.mylibrary.entity.Reader;
import com.dhu.mylibrary.service.IReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/reader")
public class ReaderController {
    @Autowired
    IReaderService service;

    @PostMapping("updatereader")
    public Object updateReader(@RequestBody Reader reader){

        System.out.println(reader);
        return service.updateById(reader);
    }

    @PostMapping("readerinfo")
    public Object getReader(Integer readerId){
        return  service.getReaderInfo(readerId);
    }
}
