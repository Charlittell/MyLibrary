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
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "userId", type = IdType.AUTO)
    private Integer userId;

        @TableField("userName")
    private String userName;

    private String password;

            /**
            * 等级权限表0是管理员1-5对于authority表
            */
    private Integer authority;


}
