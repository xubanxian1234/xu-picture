package com.xubanxian.xupicturebackend.exception;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Getter;

/**
 * Package: com.xubanxian.xupicturebackend.exception
 * Description：
 * 1、建议跟主流的错误码（比如 HTTP 错误码）的含义保持一致，
 * 例如，“未登录” 定义为 40100，和 HTTP 401 错误（用户需要进行身份认证）保持一致，会更容易理解
 * 2、错误码不要完全连续，预留一些间隔，便于后续扩展
 * 例如，401的含义是用户需要进行该身份认证，其中包含了00未登录和01无权限两种不同具体情况
 * @Author：xubanxian
 * @Create：2024/12/8 - 17:01
 * @Version：v1.0
 */
@Getter
public enum ErrorCode {
    SUCCESS(0, "OK"),
    PARAMS_ERROR(40000, "请求参数错误"),
    NOT_LOGIN_ERROR(40100, "未登录"),
    NO_AUTH_ERROR(40101, "无权限"),
    NOT_FOUND_ERROR(40400, "请求数据不存在"),
    FORBIDDEN_ERROR(40300, "禁止访问"),
    SYSTEM_ERROR(50000, "系统内部异常"),
    OPERATION_ERROR(50001, "操作失败");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 状态信息
     */
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 根据错误码获取错误信息
     * @param code 目标错误码
     * @return 若不为空则结果为code错误码对应的ErrorCode的message
     */
    public static String getMessageByCode(int code) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (errorCode.getCode() == code) {
                return errorCode.getMessage();
            }
        }
        return null;
    }
}
