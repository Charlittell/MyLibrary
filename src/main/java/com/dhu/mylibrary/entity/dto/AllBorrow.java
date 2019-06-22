package com.dhu.mylibrary.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AllBorrow {
    private Integer bookId;
    private Integer readerId;
    private Integer borrowId;
    private String borrowDate;
    private String returnDate;
    private Integer renewCount;
    private String bookName;
    private String dueTime;
    private String userName;
}
