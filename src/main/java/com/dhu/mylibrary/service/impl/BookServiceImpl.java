package com.dhu.mylibrary.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dhu.mylibrary.entity.Book;
import com.dhu.mylibrary.mapper.BookMapper;
import com.dhu.mylibrary.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Override
    public IPage<List<Book>> selectBookList(Page page) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("typeId",1);
        return baseMapper.selectPage(page,wrapper);
    }

    @Override
    public List<Book> selectBookByCondition(Book book) {
        Map<String,Object> params = new HashMap<>();
        params.put("book",book);
        return baseMapper.selectByCondition(params);
    }
}
