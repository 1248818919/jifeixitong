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
@TableName("tugapplyopecontent")
public class ApplyContent {
    private String Tugapplyid;
    private String Operationname;
    private String Operationtime;
    private String Operationloc;
    private Integer Mkey;
    private Integer Tugnumber;
    @TableField(insertStrategy = FieldStrategy.NEVER)
    private Integer cost;

    public ApplyContent(String tugapplyid, String operationname, String operationtime, String operationloc, Integer mkey, Integer tugnumber) {
        Tugapplyid = tugapplyid;
        Operationname = operationname;
        Operationtime = operationtime;
        Operationloc = operationloc;
        Mkey = mkey;
        Tugnumber = tugnumber;
    }
}
