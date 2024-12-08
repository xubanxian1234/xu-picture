package com.xubanxian.xupicturebackend.common;

import com.xubanxian.xupicturebackend.exception.ErrorCode;

/**
 * Package: com.xubanxian.xupicturebackend.common
 * Description：BaseResponse在common外部统一通过本工具类创建
 *
 * @Author：xubanxian
 * @Create：2024/12/8 - 20:20
 * @Version：v1.0
 */
public final class ResultUtils {

    /**
     * 成功
     * @param data 数据
     * @param <T> 数据类型
     * @return 响应
     */
    public static <T> BaseResponse<T> success(T data) {
        // message为从ErrorCode中查找code为0的ErrorCode对应的message
        return new BaseResponse<>(0, data, ErrorCode.getMessageByCode(0));
    }

    /**
     * 失败
     * @param errorCode 错误码
     * @return 响应
     */
    public static BaseResponse<?> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code    错误码
     * @param message 错误信息
     * @return 响应
     */
    public static BaseResponse<?> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @return 响应
     */
    public static BaseResponse<?> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
}
