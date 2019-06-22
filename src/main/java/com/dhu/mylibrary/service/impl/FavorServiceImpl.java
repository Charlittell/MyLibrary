package com.dhu.mylibrary.service.impl;

import com.dhu.mylibrary.entity.Book;
import com.dhu.mylibrary.entity.Favor;
import com.dhu.mylibrary.mapper.FavorMapper;
import com.dhu.mylibrary.service.IFavorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huihui
 * @since 2019-06-02
 */
@Service
public class FavorServiceImpl extends ServiceImpl<FavorMapper, Favor> implements IFavorService {
    @Override
    public Integer addFavor(Integer bookId, Integer readerId) {
        return baseMapper.addfavor(bookId,readerId);
    }

    @Override
    public List<Book> getFavor(Integer readerId) {
        return baseMapper.getfavor(readerId);
    }
}
