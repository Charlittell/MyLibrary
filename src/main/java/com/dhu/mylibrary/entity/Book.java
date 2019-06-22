package com.dhu.mylibrary.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;

    import com.fasterxml.jackson.annotation.JsonProperty;
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
    public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 图书编号
            */
            @TableId(value = "bookId", type = IdType.AUTO)
    private Integer bookId;

            /**
            * ISBN号（11位)
            */
        @TableField("ISBN")
        @JsonProperty("ISBN")
    private String ISBN;

            /**
            * 书名
            */
        @TableField("bookName")
    private String bookName;

            /**
            * 作者
            */
    private String author;

            /**
            * 出版社
            */
    private String publisher;

            /**
            * 单价
            */
    private Double price;

            /**
            * 当前库存
            */
        @TableField("stockNumber")
    private Integer stockNumber;

            /**
            * 总库存数
            */
    private Integer total;

            /**
            * 借书次数
            */
        @TableField("borrowCount")
    private Integer borrowCount;

            /**
            * 图片名
            */
    private String picture;

            /**
            * 图书类型编号
            */
        @TableField("typeName")
    private String typeName;

            /**
            * 书架编号
            */
    private Integer shelter;

    private String description;


}
