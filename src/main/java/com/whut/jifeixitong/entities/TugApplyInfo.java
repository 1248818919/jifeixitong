package com.whut.jifeixitong.entities;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tugapplymsginfo")
public class TugApplyInfo {
    private String Tugapplyid;
    private String Applydate;
    private String Proposername;
    private String Chinesename;
    private String Englishname;
    private String Mmsi;
    private String Sacompany;
    @TableField(insertStrategy = FieldStrategy.NEVER)
    private String confirmremark;
    @TableField(exist = false)
    private String sttime;
    @TableField(exist = false)
    private String edtime;
    private String applicant;
    private String shiptel;
    @TableField(insertStrategy = FieldStrategy.NEVER)
    private String Auditstate;
    @TableField(insertStrategy = FieldStrategy.NEVER)
    private String Auditclerk;
    @TableField(insertStrategy = FieldStrategy.NEVER)
    private String checkstate;
    @TableField(insertStrategy = FieldStrategy.NEVER)
    private String checker;
    @TableField(insertStrategy = FieldStrategy.NEVER)
    private String Isrespagree;
    @TableField(insertStrategy = FieldStrategy.NEVER)
    private String Respagreemsg;
    @TableField(insertStrategy = FieldStrategy.NEVER)
    private String Payunit;

    public TugApplyInfo(String tugapplyid, String applydate, String proposername, String chinesename, String englishname, String mmsi, String sacompany, String applicant, String shiptel) {
        Tugapplyid = tugapplyid;
        Applydate = applydate;
        Proposername = proposername;
        Chinesename = chinesename;
        Englishname = englishname;
        Mmsi = mmsi;
        Sacompany = sacompany;
        this.applicant = applicant;
        this.shiptel = shiptel;
    }

    public TugApplyInfo(String tugapplyid, String applydate, String proposername, String chinesename, String englishname,
                        String mmsi, String sacompany, String sttime, String edtime, String applicant, String shiptel) {
        Tugapplyid = tugapplyid;
        Applydate = applydate;
        Proposername = proposername;
        Chinesename = chinesename;
        Englishname = englishname;
        Mmsi = mmsi;
        Sacompany = sacompany;
        this.sttime = sttime;
        this.edtime = edtime;
        this.applicant = applicant;
        this.shiptel = shiptel;
    }
}
