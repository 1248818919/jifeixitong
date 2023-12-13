package com.whut.jifeixitong.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.whut.jifeixitong.entities.*;
import com.whut.jifeixitong.service.TugService;
import com.whut.jifeixitong.utils.CommonResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TugController {

    @Autowired
    TugService tugService;

    @PostMapping("/apply_tug")
    public CommonResult<String> Tug_Apply(@RequestBody ApplyDTO applyDTO){
        tugService.apply_tug(applyDTO);
        return CommonResult.success("success");
    }

    @PostMapping("/audit_tug")
    public CommonResult<String> Tug_Audit(@RequestBody AuditDTO auditDTO){
        tugService.edit_audiState(auditDTO);
        return CommonResult.success("success");
    }

    @PostMapping("/apply_list")
    public CommonResult getapplylist(@RequestBody QueryParams queryParams) {
        IPage<TugApplyInfo> page = tugService.listapply(queryParams);
        // 获取总条数
        long size = page.getTotal();
        // 条件成立
        if(size > 0)
        {
            return CommonResult.success(page);
        } else {
            return CommonResult.fail(false);
        }
    }

    @PostMapping("/applicant_apply_list")
    public CommonResult getapplycontentlistapplicant(@RequestBody QueryParams queryParams) {
        IPage<TugApplyInfo> page = tugService.listapplyapplicant(queryParams);
        // 获取总条数
        long size = page.getTotal();
        // 条件成立
        if(size > 0)
        {
            return CommonResult.success(page);
        } else {
            return CommonResult.fail(false);
        }
    }

    @PostMapping("/apply_content_list")
    public CommonResult getapplycontentlist(@RequestBody QueryParams queryParams) {
        IPage<ApplyContent> page = tugService.listapplycontent(queryParams);
        // 获取总条数
        long size = page.getTotal();
        // 条件成立
        if(size > 0)
        {
            return CommonResult.success(page);
        } else {
            return CommonResult.fail(false);
        }
    }

    @PostMapping("/comfirm_tug")
    public CommonResult confirm_tug(@RequestBody ConfirmDTO confirmDTO)
    {
        if(tugService.confirm_tug(confirmDTO)){
            return CommonResult.success("true");
        }
        else{
            return CommonResult.fail("fail");
        }
    }

    @PostMapping("/pay_tug")
    public CommonResult pay_tug(@RequestBody PayDTO payDTO){
        if(tugService.pay_tug(payDTO)){
            return CommonResult.success("true");
        }
        else{
            return CommonResult.fail("fail");
        }
    }

    @PostMapping("/IsAgree")
    public CommonResult pay_tug(@RequestBody AgreeDTO agreeDTO){
        if(tugService.IsAgree(agreeDTO)){
            return CommonResult.success("true");
        }
        else{
            return CommonResult.fail("fail");
        }
    }

    @PostMapping("/get_piaoju")
    public CommonResult get_piaoju(@RequestBody PayDTO payDTO){
        List<ShipAndApplyAndContent> res = tugService.get_piaoju(payDTO);
        if(res == null){
            return CommonResult.fail("false");
        }
        else {
            return CommonResult.success(res);
        }
    }
}
