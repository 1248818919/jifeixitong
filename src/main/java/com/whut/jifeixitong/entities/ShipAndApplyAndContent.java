package com.whut.jifeixitong.entities;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShipAndApplyAndContent {
    private String Tugapplyid;
    private String Operationname;
    private String Operationtime;
    private String Operationloc;
    private Integer Mkey;
    private Integer Tugnumber;
    private String Applydate;
    private String Proposername;
    private String Chinesename;
    private String Englishname;
    private String Mmsi;
    private String Sacompany;
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
    private Integer id;
    private String Agentname;
    private String zhname;
    private String enname;
    private String mmsi;
    private String nationality;
    private String shiptype;
    private double shiplength;
    private double shipwidth;
    private double totaltonnum;
    private double loadtonnum;
    private double nettonnum;
}
