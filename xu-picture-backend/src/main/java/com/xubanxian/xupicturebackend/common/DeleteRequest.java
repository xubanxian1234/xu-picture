package com.xubanxian.xupicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Package: com.xubanxian.xupicturebackend.common
 * Description：删除请求包装类
 *
 * @Author：xubanxian
 * @Create：2024/12/8 - 21:24
 * @Version：v1.0
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
