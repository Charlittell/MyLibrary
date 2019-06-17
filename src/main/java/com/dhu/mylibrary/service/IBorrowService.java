package com.dhu.mylibrary.service;

import com.dhu.mylibrary.entity.Borrow;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
public interface IBorrowService extends IService<Borrow> {
    public void borrowBook(Integer bookId,Integer readerId);
    public void returnBook(Integer bookId,Integer readerId);
    public void renewBook(Integer bookId,Integer readerId);
}
