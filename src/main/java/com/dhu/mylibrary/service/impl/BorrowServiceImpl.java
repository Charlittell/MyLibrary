package com.dhu.mylibrary.service.impl;

import com.dhu.mylibrary.entity.Borrow;
import com.dhu.mylibrary.entity.dto.AllBorrow;
import com.dhu.mylibrary.entity.dto.MyBorrow;
import com.dhu.mylibrary.mapper.BorrowMapper;
import com.dhu.mylibrary.service.IBorrowService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
@Service
public class BorrowServiceImpl extends ServiceImpl<BorrowMapper, Borrow> implements IBorrowService {
    @Override
    public Integer borrowBook(Integer bookId, Integer readerId) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String time = df.format(new Date());
        return baseMapper.borrowBook(bookId,readerId,time);
    }

    @Override
    public List<MyBorrow> getMyBorrow(Integer readerId) {
        return baseMapper.getMyBorrow(readerId);
    }

    @Override
    public Integer returnBook(Integer borrowId,Integer bookId, Integer readerId) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String time = df.format(new Date());
        return baseMapper.returnBook(borrowId,bookId,readerId,time);
    }

    @Override
    public Integer renewBook(Integer borrowId,Integer bookId, Integer readerId) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String time = df.format(new Date());
        return baseMapper.renewBook(borrowId,bookId,readerId,time);
    }

    @Override
    public List<AllBorrow> getAllBorrow() {
        return baseMapper.getAllBorrow();
    }

    @Override
    public List<AllBorrow> selectByUser(String userName) {
        return baseMapper.selectByUser(userName);
    }

    @Override
    public List<AllBorrow> selectByBook(String bookName) {
        return baseMapper.selectByBook(bookName);
    }
}
