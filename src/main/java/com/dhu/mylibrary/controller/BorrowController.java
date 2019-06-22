package com.dhu.mylibrary.controller;


import com.dhu.mylibrary.entity.Book;
import com.dhu.mylibrary.entity.dto.MyBorrow;
import com.dhu.mylibrary.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public Integer borrowBook(Integer readerId,Integer bookId){
        return service.borrowBook(bookId,readerId);
    }

    @PostMapping("returnBook")
    public Integer returnBook(Integer borrowId,Integer readerId,Integer bookId){
        return service.returnBook(borrowId,readerId,bookId);
    }

    @PostMapping("renewBook")
    public Integer renewBook(Integer borrowId,Integer readerId,Integer bookId){
        return service.renewBook(borrowId,readerId,bookId);
    }

    @PostMapping("getmyborrow")
    public Object getMyBorrow(Integer readerId){
        System.out.println(readerId);
        return service.getMyBorrow(readerId);
    }

    @GetMapping("getallborrow")
    public Object getAllBorrow(){

        return service.getAllBorrow();
    }


    @PostMapping("selectByUser")
    public Object selectByUser(String userName){
        System.out.println(userName);
        return service.selectByUser(userName);
    }

    @PostMapping("selectByBook")
    public Object selectByBook(String bookName){

        return service.selectByBook(bookName);
    }
}
