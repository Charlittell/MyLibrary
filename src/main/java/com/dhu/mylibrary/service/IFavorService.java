package com.dhu.mylibrary.service;

import com.dhu.mylibrary.entity.Book;
import com.dhu.mylibrary.entity.Favor;
import com.baomidou.mybatisplus.extension.service.IService;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huihui
 * @since 2019-06-02
 */
public interface IFavorService extends IService<Favor> {
    public Integer addFavor(Integer bookId,Integer readerId);
    public List<Book> getFavor(Integer readerId);
}
