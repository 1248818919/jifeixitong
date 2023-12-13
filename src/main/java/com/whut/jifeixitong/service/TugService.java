package com.whut.jifeixitong.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.whut.jifeixitong.entities.*;

import java.util.List;

public interface TugService {
    IPage<TugApplyInfo> listapply(QueryParams queryParams);
    IPage<TugApplyInfo> listapplyapplicant(QueryParams queryParams);
    IPage<ApplyContent> listapplycontent(QueryParams queryParams);
    boolean apply_tug(ApplyDTO applyDTO);
    boolean edit_audiState(AuditDTO auditDTO);
    boolean confirm_tug(ConfirmDTO con);
    boolean pay_tug(PayDTO payDTO);
    boolean IsAgree(AgreeDTO agreeDTO);
    List<ShipAndApplyAndContent> get_piaoju(PayDTO payDTO);
}
