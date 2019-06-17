package com.dhu.mylibrary.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dhu.mylibrary.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dhu.mylibrary.mapper.provider.BookDynaSqlProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
public interface BookMapper extends BaseMapper<Book> {
    @SelectProvider(type= BookDynaSqlProvider.class,method = "selectWithParam")
    List<Book> selectByCondition(Map<String,Object> params);
}
