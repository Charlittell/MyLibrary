package com.dhu.mylibrary.mapper;

import com.dhu.mylibrary.entity.Book;
import com.dhu.mylibrary.entity.Favor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huihui
 * @since 2019-06-02
 */
public interface FavorMapper extends BaseMapper<Favor> {
    @Insert("insert into favor(bookId,readerId) values(#{bookId},#{readerId})")
    public Integer addfavor(Integer bookId,Integer readerId);

    @Select("select * from book,favor where book.bookId= favor.bookId and favor.readerId =#{readerId}")
    public List<Book> getfavor(Integer readerId);

}
