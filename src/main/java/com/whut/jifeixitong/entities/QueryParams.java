package com.whut.jifeixitong.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryParams {
    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 页码（当前页）
     */
    private Integer pageNum;

    /**
     * 其他查询条件
     */
    private Map<String,Object> condition = new ConcurrentHashMap<>();
}