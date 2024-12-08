package com.xubanxian.xupicturebackend.exception;

import lombok.Getter;

/**
 * Package: com.xubanxian.xupicturebackend.exception
 * Description：自定义业务异常
 *
 * @Author：xubanxian
 * @Create：2024/12/8 - 17:08
 * @Version：v1.0
 */
@Getter
public class BusinessException extends RuntimeException{
    /**
     * 错误码
     */
    private final int code;

    /**
     * 限制不让外部进行访问，防止被意外塞入不合适code
     */
    private BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }
}
