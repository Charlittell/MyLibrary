package com.dhu.mylibrary.mapper;

import com.dhu.mylibrary.entity.Reader;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
public interface ReaderMapper extends BaseMapper<Reader> {
    @Update("update reader set realName = #{realName},age = #{age},sex = #{sex},phone = #{phone} where readerId = #{readerId}")
    int modifyReaderInformation(Reader reader);
}
