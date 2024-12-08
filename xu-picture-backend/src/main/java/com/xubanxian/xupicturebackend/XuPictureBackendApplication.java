package com.xubanxian.xupicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/xubanxian/xupicturebackend/mapper")
public class XuPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuPictureBackendApplication.class, args);
    }

}
