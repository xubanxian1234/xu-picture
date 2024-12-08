package com.xubanxian.xupicturebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.xubanxian.xupicturebackend.controller
 * Description：
 *
 * @Author：xubanxian
 * @Create：2024/12/8 - 16:10
 * @Version：v1.0
 */

@RestController
@RequestMapping("/")
public class MainController{

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public String health() {
        return "ok";
    }
}