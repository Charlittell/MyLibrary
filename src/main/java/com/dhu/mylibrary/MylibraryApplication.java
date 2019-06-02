package com.dhu.mylibrary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dhu.mylibrary.mapper")
public class MylibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MylibraryApplication.class, args);
    }

}
