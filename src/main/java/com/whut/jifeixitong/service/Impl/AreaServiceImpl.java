package com.whut.jifeixitong.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.whut.jifeixitong.entities.Area;
import com.whut.jifeixitong.mapper.AreaInfoMapper;
import com.whut.jifeixitong.service.AreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaInfoMapper areaInfoMapper;

    @Override
    public List<Area> get_Area() {
        QueryWrapper<Area> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNotNull("Areaname");
        return areaInfoMapper.selectList(queryWrapper);
    }
}
