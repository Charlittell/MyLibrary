package com.dhu.mylibrary.mapper;

import com.dhu.mylibrary.entity.Borrow;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dhu.mylibrary.entity.dto.AllBorrow;
import com.dhu.mylibrary.entity.dto.MyBorrow;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

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
    @Select("select  borrowBook(#{readerId},#{bookId},#{time}) from dual")
    public Integer borrowBook(Integer bookId,Integer readerId,String time);

    @Select("select returnBook(#{borrowId},#{bookId},#{readerId},#{time}) from dual")
    public Integer returnBook(Integer borrowId,Integer bookId,Integer readerId,String time);

    @Select("select renewBook(#{borrowId},#{readerId},#{bookId},#{time}) from dual")
    public Integer renewBook(Integer borrowId,Integer bookId,Integer readerId,String time);

    @Select("select borrowId,borrow.bookId,readerId,borrowDate,returnDate,renewCount,bookName from borrow,book where borrow.readerId=#{readerId} and borrow.bookId=book.bookId order by returnDate  ")
    public List<MyBorrow> getMyBorrow(Integer readerId);

    @Select("select * from borrow,book,user where borrow.readerId=user.userId and borrow.bookId=book.bookId and borrow.returnDate is null  ")
    public List<AllBorrow> getAllBorrow();

    @Select("select * from borrow,book,user where borrow.readerId=user.userId and borrow.bookId=book.bookId and borrow.returnDate is null and user.userName=#{userName} ")
    public List<AllBorrow> selectByUser(String userName);

    @Select("select * from borrow,book,user where borrow.readerId=user.userId and borrow.bookId=book.bookId and borrow.returnDate is null and book.bookName = #{bookName} ")
    public List<AllBorrow> selectByBook(String bookName);
}
