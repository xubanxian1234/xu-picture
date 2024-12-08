package com.xubanxian.xupicturebackend.common;

import lombok.Data;

/**
 * Package: com.xubanxian.xupicturebackend.common
 * Description：分页请求包装类
 *
 * @Author：xubanxian
 * @Create：2024/12/8 - 21:20
 * @Version：v1.0
 */
@Data
public class PageRequest {
    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";
}
