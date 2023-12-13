package com.whut.jifeixitong.controller;

import com.whut.jifeixitong.entities.Area;
import com.whut.jifeixitong.service.AreaService;
import com.whut.jifeixitong.utils.CommonResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@Slf4j
@RequiredArgsConstructor
public class AreaController {
    @Autowired
    AreaService areaService;

    @PostMapping("/get_Area")
    public CommonResult get_Area(){
        List<Area> conts = areaService.get_Area();
        if(Objects.nonNull(conts)){
            return CommonResult.success(conts);
        }
        else {
            return CommonResult.fail("false");
        }
    }
}
