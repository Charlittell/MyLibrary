package com.dhu.mylibrary.service;

import com.dhu.mylibrary.entity.Reader;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dhu.mylibrary.entity.dto.ReaderInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
public interface IReaderService extends IService<Reader> {
    ReaderInfo getReaderInfo(Integer readerId);
}
