package com.whut.jifeixitong.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.whut.jifeixitong.entities.AgentShip;
import com.whut.jifeixitong.mapper.AgentShipMapper;
import com.whut.jifeixitong.service.AgentShipService;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AgentShipServiceImpl implements AgentShipService {

    @Autowired
    AgentShipMapper agentShipMapper;

    @Override
    public AgentShip get_AgentShipInfo(String zhName) {
        QueryWrapper<AgentShip> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("zhname", zhName);
        return agentShipMapper.selectOne(queryWrapper);
    }
}
