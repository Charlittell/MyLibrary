package com.dhu.mylibrary.controller;


import com.dhu.mylibrary.entity.Book;
import com.dhu.mylibrary.service.IBorrowService;
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
 * @since 2019-06-01
 */
@RestController
@RequestMapping("/borrow")
public class BorrowController {
    @Autowired
    IBorrowService service;
    @PostMapping("borrowBook")
    public void borrowBook(Integer readerId,Integer bookId){
        service.borrowBook(bookId,readerId);
    }

    @PostMapping("returnBook")
    public void returnBook(Integer readerId,Integer bookId){
        service.returnBook(readerId,bookId);
    }

    @PostMapping("renewBook")
    public void renewBook(Integer readerId,Integer bookId){
        service.renewBook(readerId,bookId);
    }


}
