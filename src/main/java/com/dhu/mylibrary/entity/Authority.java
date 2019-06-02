package com.dhu.mylibrary.entity;

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
    public class Authority implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer level;

        @TableField("maxBorrowed")
    private Integer maxBorrowed;

        @TableField("borrowContinue")
    private Integer borrowContinue;

        @TableField("borrowTime")
    private Integer borrowTime;


}
