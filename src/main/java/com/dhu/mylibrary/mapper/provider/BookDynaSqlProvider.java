package com.dhu.mylibrary.mapper.provider;

import com.dhu.mylibrary.entity.Book;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class BookDynaSqlProvider {
    public String selectWithParam(Map<String,Object> params){
        String sql = new SQL(){
            {
                SELECT("*");
                FROM("book");
                if(params.get("book") != null){
                    Book book = (Book)params.get("book");
                    if(book.getBookName() != null && !book.getBookName().equals("")){
                        WHERE("bookName LIKE CONCAT('%',#{book.bookName},'%')");
                    }
                    if(book.getAuthor() != null && !book.getAuthor().equals("")){
                        WHERE("author LIKE CONCAT('%',#{book.author},'%')");
                    }
                    if(book.getBookId() != null && !book.getBookId().equals("")){
                        WHERE("bookId LIKE CONCAT('%',#{book.bookId},'%')");
                    }
                    if(book.getTypeId() != null && !book.getTypeId().equals("")){
                        WHERE("typeName LIKE CONCAT('%',#{book.typeId},'%')");
                    }
                    if(book.getPublisher() != null && !book.getPublisher().equals("")){
                        WHERE("publisher LIKE CONCAT('%',#{book.publisher},'%')");
                    }
                }
            }
        }.toString();
        return sql;
    }


}
