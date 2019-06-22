package com.dhu.mylibrary.entity.dto;

import com.dhu.mylibrary.entity.Book;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SearchResult {
    private Book book;
    private Integer size;
    private Integer cu;
}
