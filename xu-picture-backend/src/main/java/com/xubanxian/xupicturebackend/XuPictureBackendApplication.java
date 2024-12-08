package com.xubanxian.xupicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com/xubanxian/xupicturebackend/mapper")
@EnableAspectJAutoProxy(exposeProxy = true) // 通过 Spring AOP 提供对当前代理对象的访问，使得可以在业务逻辑中访问到当前的代理对象。你可以在方法执行时通过 AopContext.currentProxy() 获取当前的代理对象。
public class XuPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuPictureBackendApplication.class, args);
    }

}
