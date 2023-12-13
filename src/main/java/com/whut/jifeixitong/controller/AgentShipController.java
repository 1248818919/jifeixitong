package com.whut.jifeixitong.controller;

import com.whut.jifeixitong.entities.AgentShip;
import com.whut.jifeixitong.service.AgentShipService;
import com.whut.jifeixitong.utils.CommonResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@Slf4j
@RequiredArgsConstructor
public class AgentShipController {

    @Autowired
    AgentShipService agentShipService;

    @PostMapping("/get_shipagent")
    public CommonResult<AgentShip> get_ShipAgentInfo(@RequestBody Map<String, Object> params){
        AgentShip res = agentShipService.get_AgentShipInfo((String)params.get("zhName"));
        if(Objects.nonNull(res)){
            return CommonResult.success(res);
        }
        return CommonResult.fail("false");
    }
}
