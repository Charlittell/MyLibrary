package com.dhu.mylibrary.service.impl;

import com.dhu.mylibrary.entity.Book;
import com.dhu.mylibrary.mapper.BookMapper;
import com.dhu.mylibrary.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
