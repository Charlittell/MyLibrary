package com.dhu.mylibrary.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dhu.mylibrary.entity.Book;
import com.dhu.mylibrary.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.plugin2.util.ParameterNames;

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
    @GetMapping("bookhot")
    public Object bookhot(){
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("borrowCount");
        return  service.list(wrapper);
    }

    @GetMapping("bookpage")
    public Object bookpage(Page page){
        return service.selectBookList(page);
    }

    @PostMapping("selectByCondition")
    public Object selectBookByCondition(@RequestBody Book book){
        System.out.println(book);
        return service.selectBookByCondition(book);
    }

    @PostMapping("updateBook")
    public Object updateBook(@RequestBody Book book){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("bookId",book.getBookId());
        return service.update(book,wrapper);
    }

    @PostMapping("deleteBook")
    public Object deleteBook(Integer bookId){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("bookId",bookId);
        return service.removeById(bookId);
    }

}
