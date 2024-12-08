package com.xubanxian.xupicturebackend.exception;

/**
 * Package: com.xubanxian.xupicturebackend.exception
 * Description: 异常抛出工具类
 *
 * @Author：xubanxian
 * @Create：2024/12/8 - 17:14
 * @Version：v1.0
 */
public final class ThrowUtils {

    /**
     * 若条件成立，则抛出指定的 RuntimeException 异常
     *
     * @param condition 条件，若为 true 则抛出异常
     * @param runtimeException 待抛出的 RuntimeException 异常
     */
     public static void throwIf(boolean condition, RuntimeException runtimeException) {
         if (condition) {
             throw runtimeException;
         }
     }

    /**
     * 若条件成立则抛出对应错误码的 BusinessException
     *
     * @param condition 条件，若为 true 则抛出异常
     * @param errorCode 错误码，用于构造 BusinessException
     */
     public static void throwIf(boolean condition, ErrorCode errorCode) {
         throwIf(condition, new BusinessException(errorCode));
     }

    /**
     * 若条件成立，则抛出带有错误码和错误信息的 BusinessException
     *
     * @param condition 条件，若为 true 则抛出异常
     * @param errorCode 错误码，用于构造 BusinessException
     * @param message 错误信息，用于构造 BusinessException
     */
     private static void throwIf(boolean condition, ErrorCode errorCode, String message) {
         throwIf(condition, new BusinessException(errorCode, message));
     }
}
