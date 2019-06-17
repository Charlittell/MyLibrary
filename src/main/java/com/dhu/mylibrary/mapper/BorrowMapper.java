package com.dhu.mylibrary.mapper;

import com.dhu.mylibrary.entity.Borrow;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
public interface BorrowMapper extends BaseMapper<Borrow> {
    /**
     * 借书
     * */
    @Select(value = "call borrowBook(#{bookId},#{readerId},#{time})")
    public void borrowBook(Integer bookId,Integer readerId,String time);

    @Select(value = "call returnBook(#{bookId},#{readerId},#{time})")
    public void returnBook(Integer bookId,Integer readerId,String time);

    @Select(value = "call returnBook(#{bookId},#{readerId},#{time})")
    public void renewBook(Integer bookId,Integer readerId,String time);
}
