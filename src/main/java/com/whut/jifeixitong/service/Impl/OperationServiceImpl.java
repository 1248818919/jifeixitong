package com.whut.jifeixitong.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.whut.jifeixitong.entities.OpeContent;
import com.whut.jifeixitong.mapper.OpeContentMapper;
import com.whut.jifeixitong.service.OperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OperationServiceImpl implements OperationService {

    @Autowired
    OpeContentMapper opemapper;

    @Override
    public List<OpeContent> search_content() {
        QueryWrapper<OpeContent> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("disable","false");
        return opemapper.selectList(queryWrapper);
    }


}
