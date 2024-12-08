package com.xubanxian.xupicturebackend.common;

import com.xubanxian.xupicturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * Package: com.xubanxian.xupicturebackend.common
 * Description：不允许common包外部直接调用
 *
 * @Author：xubanxian
 * @Create：2024/12/8 - 19:33
 * @Version：v1.0
 *
 * 不使用map作为data的类型的原因：
 * 用泛型的话，生成接口文档会带上那个类型结构，前端用那个openapi的插件直接生成就ok了。
 * 但如果是Map，就做不到，前端还得跟后端沟通到底是什么字段
 */
@Data
public class BaseResponse<T> implements Serializable {
    private int code;
    private T data;
    private String message;

    BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    BaseResponse(int code, T data) {
        this(code, data, "");
    }

    BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }

}
