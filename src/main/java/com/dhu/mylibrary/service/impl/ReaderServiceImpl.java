package com.dhu.mylibrary.service.impl;

import com.dhu.mylibrary.entity.Reader;
import com.dhu.mylibrary.entity.dto.ReaderInfo;
import com.dhu.mylibrary.mapper.ReaderMapper;
import com.dhu.mylibrary.service.IReaderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huihui
 * @since 2019-06-01
 */
@Service
public class ReaderServiceImpl extends ServiceImpl<ReaderMapper, Reader> implements IReaderService {
    @Override
    public ReaderInfo getReaderInfo(Integer readerId) {
        return baseMapper.getReaderInfo(readerId);
    }
}
