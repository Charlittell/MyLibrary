package com.dhu.mylibrary.service;

import com.dhu.mylibrary.entity.Borrow;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dhu.mylibrary.entity.dto.AllBorrow;
import com.dhu.mylibrary.entity.dto.MyBorrow;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
public interface IBorrowService extends IService<Borrow> {
    public Integer borrowBook(Integer bookId,Integer readerId);
    public Integer returnBook(Integer borrowId,Integer bookId,Integer readerId);
    public Integer renewBook(Integer borrowId,Integer bookId,Integer readerId);
    public List<MyBorrow> getMyBorrow(Integer readerId);
    public List<AllBorrow> getAllBorrow();
    public List<AllBorrow> selectByUser(String userName);
    public List<AllBorrow> selectByBook(String bookName);
}
