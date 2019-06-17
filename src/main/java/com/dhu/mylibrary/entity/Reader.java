package com.dhu.mylibrary.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author huihui
* @since 2019-06-01
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Reader implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "readerId",type = IdType.INPUT)
    private Integer readerId;

        @TableField("realName")
    private String realName;

    private Integer age;

    private String sex;

    private String phone;

        @TableField("hasBorrowed")
    private Integer hasBorrowed;


}
