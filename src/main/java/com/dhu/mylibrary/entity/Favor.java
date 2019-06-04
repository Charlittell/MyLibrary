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
* @since 2019-06-02
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Favor implements Serializable {

    private static final long serialVersionUID = 1L;

        @TableField("bookId")
    private Integer bookId;

            @TableId(value = "favorId", type = IdType.AUTO)
    private Integer favorId;

        @TableField("readerId")
    private Integer readerId;


}
