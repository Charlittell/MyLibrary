package com.dhu.mylibrary.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dhu.mylibrary.entity.Book;
import com.dhu.mylibrary.entity.dto.SearchResult;
import com.dhu.mylibrary.service.IBookService;
import com.dhu.mylibrary.service.impl.ImageUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
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

    ImageUploadService imageUploadService = new ImageUploadService();
    @GetMapping("bookhot")
    public Object bookhot(){
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("borrowCount");
        return  service.list(wrapper);
    }

    @PostMapping("bookpage")
    public Object bookpage(Integer cu,Integer size){

        Page page = new Page();
        page.setCurrent(cu);
        page.setSize(size);
        return service.selectBookList(page);
    }

    @PostMapping("selectByCondition")
    public Object selectBookByCondition(@RequestBody Book book){
        System.out.println(book);
        return service.selectBookByCondition(book);
    }

    @PostMapping("updatebookpicture")
    public Object updateBookPicture(@RequestParam("file") MultipartFile image, Book book){
        String uploadPath = "static/bookimg/";  // 服务器上上传文件的相对路径
        String physicalUploadPath = getClass().getClassLoader().getResource(uploadPath).getPath();  // 服务器上上传文件的物理路径
        String imageURL = imageUploadService.uploadImage(image, uploadPath, physicalUploadPath);
        String res =  image.getOriginalFilename();
        book.setPicture(res);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("bookId",book.getBookId());
        return service.update(book,wrapper);
    }

    @PostMapping("updatebook")
    public Object updateBook(@RequestBody Book book){
        System.out.println(book);
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

    @PostMapping("searchBook")
    public Object searchBook(@RequestBody SearchResult result){
        Page page = new Page();
        page.setCurrent(result.getCu());
        page.setSize(result.getSize());
        return service.searchBook(result.getBook(),page);
    }

    @PostMapping("selectBookById")
    public Book selectBookById(Integer bookId){
        return service.getById(bookId);
    }

    @PostMapping("insertbook")
    public Integer insertBook(@RequestBody Book book){
//        System.out.println(book);
        return 0;
    }

    @PostMapping(value = "/postimg")
    public boolean postImg( @RequestParam("file") MultipartFile image,Book book) {
        String uploadPath = "static/bookimg/";  // 服务器上上传文件的相对路径
        String physicalUploadPath = getClass().getClassLoader().getResource(uploadPath).getPath();  // 服务器上上传文件的物理路径
        String imageURL = imageUploadService.uploadImage(image, uploadPath, physicalUploadPath);
        String res =  image.getOriginalFilename();
        book.setPicture(res);
        book.setStockNumber(book.getTotal());
        System.out.println(book);
        return service.save(book);


    }

}
