package com.dhu.mylibrary.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ReaderInfo {

    private Integer readerId;

    private String realName;

    private Integer age;

    private String sex;

    private String phone;

    private Integer authority;
}
