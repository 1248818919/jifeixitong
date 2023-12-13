package com.whut.jifeixitong.service.Impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.whut.jifeixitong.entities.*;
import com.whut.jifeixitong.mapper.*;
import com.whut.jifeixitong.service.TugService;
import com.whut.jifeixitong.utils.TugTool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class TugServiceImpl implements TugService {

    @Autowired
    AgentShipMapper agentShipMapper;

    @Autowired
    OpeContentMapper opeContentMapper;

    @Autowired
    ApplyopeContentMapper applyopeContentMapper;

    @Autowired
    ApplyopeInfoMapper applyopeInfoMapper;

    @Autowired
    PiaoJuMapper piaoJuMapper;

    @Override
    public IPage<TugApplyInfo> listapply(QueryParams queryParams) {
        IPage<TugApplyInfo> page = new Page<>(queryParams.getPageNum(), queryParams.getPageSize());
        QueryWrapper<TugApplyInfo> queryWrapper = null;
        queryWrapper = new QueryWrapper<>();
        return applyopeInfoMapper.selectPage(page,queryWrapper);
    }

    @Override
    public IPage<TugApplyInfo> listapplyapplicant(QueryParams queryParams) {
        String applicant = (String) queryParams.getCondition().get("applicant");
        IPage<TugApplyInfo> page = new Page<>(queryParams.getPageNum(), queryParams.getPageSize());
        QueryWrapper<TugApplyInfo> queryWrapper = null;
        if(StrUtil.isNotBlank(applicant)) {
            queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("applicant",applicant);
        }
        return applyopeInfoMapper.selectPage(page,queryWrapper);
    }

    @Override
    public IPage<ApplyContent> listapplycontent(QueryParams queryParams) {
        String applyid = (String) queryParams.getCondition().get("tugapplyid");
        IPage<ApplyContent> page = new Page<>(queryParams.getPageNum(), queryParams.getPageSize());
        QueryWrapper<ApplyContent> queryWrapper = null;
        if(StrUtil.isNotBlank(applyid)){
            queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("goodname",applyid);
        }
        return applyopeContentMapper.selectPage(page,queryWrapper);
    }

    @Override
    public boolean apply_tug(ApplyDTO applyDTO) {
        Date cur_time = new Date();
        String TugApplyID = TugTool.gen_Tug_ID(cur_time);
        String TugApplyTime = TugTool.get_tug_time(cur_time);
        String Proposername = "调度";
        QueryWrapper<AgentShip> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("zhname", applyDTO.getZhname());
        AgentShip shipinfo = agentShipMapper.selectOne(queryWrapper);

        // 第一个表tugapplyopeinfo
        TugApplyInfo sample = new TugApplyInfo(TugApplyID, TugApplyTime, Proposername, applyDTO.getZhname(), shipinfo.getEnname(),
        shipinfo.getMmsi(), shipinfo.getAgentname(), applyDTO.getSttime(), applyDTO.getEdtime(),applyDTO.getApplicant(),applyDTO.getShiptel());
        applyopeInfoMapper.insert(sample);

        // 第二个表tugapplyopecontent
        List<OpeContent> opes = opeContentMapper.selectList(new LambdaQueryWrapper<OpeContent>().in(OpeContent::getMkey, applyDTO.getOperation_mkey()));
        int count = 0;
        for(OpeContent aa : opes){
            applyopeContentMapper.insert(new ApplyContent(TugApplyID, aa.getOperationname(), applyDTO.getSttime()+"-"+applyDTO.getEdtime(),
                    applyDTO.getAreaname(), aa.getMkey(), applyDTO.getOperation_num()[count]));
            count++;
        }

        return true;
    }

    public boolean edit_audiState(AuditDTO auditDTO){
        Date date = new Date();
        String time = TugTool.get_tug_time(date);
        UpdateWrapper<TugApplyInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set("auditstate", "01")
                     .set("AuditDate",time)
                     .set("auditclerk",auditDTO.getAudit_clerk())
                     .eq("Tugapplyid", auditDTO.getApplyid());
        applyopeInfoMapper.update(null, updateWrapper);

        for(Map<String, Double> aa : auditDTO.getAa()){
            for (Map.Entry<String, Double> entry : aa.entrySet()){
                UpdateWrapper<ApplyContent> updateWrapper1 = new UpdateWrapper<>();
                updateWrapper1.set("cost", entry.getValue());
                updateWrapper1.eq("Tugapplyid", auditDTO.getApplyid());
                updateWrapper1.eq("mkey", entry.getKey());
                applyopeContentMapper.update(null, updateWrapper1);
            }
        }
        return true;
    }

    @Override
    public boolean confirm_tug(ConfirmDTO con) {
        UpdateWrapper<TugApplyInfo> updateWrapper = new UpdateWrapper<>();
        if (con.getConf() == 0) {
            updateWrapper.set("checkstate", "10").set("checker", con.getChecker()).set("confirmRemark",con.getConfirmRemark())
                    .eq("Tugapplyid", con.getApplyid());
        }else {
            updateWrapper.set("checkstate", "01").set("checker", con.getChecker()).set("confirmRemark",con.getConfirmRemark())
                    .eq("Tugapplyid", con.getApplyid());
        }
        applyopeInfoMapper.update(null, updateWrapper);
        return true;
    }

    @Override
    public boolean pay_tug(PayDTO payDTO) {
        UpdateWrapper<TugApplyInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set("payunit",payDTO.getPayunit()).eq("Tugapplyid",payDTO.getTugapplyid());
        applyopeInfoMapper.update(null, updateWrapper);
        return true;
    }

    @Override
    public boolean IsAgree(AgreeDTO agreeDTO) {
        UpdateWrapper<TugApplyInfo> updateWrapper = new UpdateWrapper<>();
        if (agreeDTO.getIsagree() == 1){
            updateWrapper.set("isrespagree", "01");
        }
        else{
            updateWrapper.set("isrespagree", "10");
        }
        updateWrapper.set("respagreemsg",agreeDTO.getResmsg()).eq("tugapplyid", agreeDTO.getTugapplyid());
        applyopeInfoMapper.update(null, updateWrapper);
        return true;
    }

    @Override
    public List<ShipAndApplyAndContent> get_piaoju(PayDTO payDTO) {
        QueryWrapper<ShipAndApplyAndContent> queryWrapper =new QueryWrapper<>();
        queryWrapper.eq("c.tugapplyid",payDTO.getTugapplyid());
        return piaoJuMapper.getPiaoJu(queryWrapper);
    }
}
