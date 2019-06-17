package com.dhu.mylibrary.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dhu.mylibrary.entity.Book;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
public interface IBookService extends IService<Book> {
//    public IPage<List<Book>> selectBookPage(Page<Book> page,Book book);

    public IPage<List<Book>> selectBookList(Page page);
    /*
     * 动态查询图书
     * */
    List<Book> selectBookByCondition(Book book);



}
