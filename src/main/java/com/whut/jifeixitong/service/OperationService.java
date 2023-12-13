package com.whut.jifeixitong.service;

import com.whut.jifeixitong.entities.OpeContent;

import java.util.List;

public interface OperationService {
    /**
     * 用来获取有什么工作内容
     * @return
     */
    public List<OpeContent> search_content();

    /**
     * 用来添加工作内容
     * @param ope
     * @return
     */
//    public OpeContent add_content(OpeContent ope);
}
