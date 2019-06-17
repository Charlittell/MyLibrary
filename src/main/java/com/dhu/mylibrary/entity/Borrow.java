package com.dhu.mylibrary.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import java.time.LocalDate;
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
    public class Borrow implements Serializable {

    private static final long serialVersionUID = 1L;

        @TableField("bookId")
    private Integer bookId;

        @TableField("readerId")
    private Integer readerId;

            @TableId(value = "borrowId", type = IdType.AUTO)
    private Integer borrowId;

        @TableField("borrowDate")
    private String borrowDate;

        @TableField("returnDate")
    private String returnDate;

        @TableField("renewCount")
    private Integer renewCount;


}
