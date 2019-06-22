package com.dhu.mylibrary.mapper;

import com.dhu.mylibrary.entity.Reader;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dhu.mylibrary.entity.dto.ReaderInfo;
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
public interface ReaderMapper extends BaseMapper<Reader> {
    @Update("update reader set realName = #{realName},age = #{age},sex = #{sex},phone = #{phone} where readerId = #{readerId}")
    int modifyReaderInformation(Reader reader);

    @Select("select readerId,age,realName,sex,phone,authority from reader,user where readerId=#{readerId} and userId=#{readerId}")
    ReaderInfo getReaderInfo(Integer readerId);
}
