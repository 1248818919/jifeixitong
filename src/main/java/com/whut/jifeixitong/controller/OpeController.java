package com.whut.jifeixitong.controller;

import com.whut.jifeixitong.entities.OpeContent;
import com.whut.jifeixitong.service.OperationService;
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
public class OpeController {

    @Autowired
    OperationService opeService;

    @PostMapping("/get_ope")
    public CommonResult<List<OpeContent>> get_ope_content(){
        List<OpeContent> conts = opeService.search_content();
        if(Objects.nonNull(conts)){
            return CommonResult.success(conts);
        }
        else {
            return CommonResult.fail("false");
        }
    }
}
