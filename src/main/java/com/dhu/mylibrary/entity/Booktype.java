package com.dhu.mylibrary.entity;

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
    public class Booktype implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId("typeId")
    private Integer typeId;

        @TableField("typeName")
    private String typeName;


}
