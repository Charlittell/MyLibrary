package com.dhu.mylibrary.service.impl;

import com.dhu.mylibrary.entity.Borrow;
import com.dhu.mylibrary.mapper.BorrowMapper;
import com.dhu.mylibrary.service.IBorrowService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    public void borrowBook(Integer bookId, Integer readerId) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String time = df.format(new Date());
        baseMapper.borrowBook(bookId,readerId,time);
    }

    @Override
    public void returnBook(Integer bookId, Integer readerId) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String time = df.format(new Date());
        baseMapper.returnBook(bookId,readerId,time);
    }

    @Override
    public void renewBook(Integer bookId, Integer readerId) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String time = df.format(new Date());
        baseMapper.renewBook(bookId,readerId,time);
    }
}
