package com.whut.jifeixitong.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("operationinfo")
public class OpeContent {
    private Integer Mkey;
    private String operationname;
    private String operationtype;
    private String chargestandard;
    private String abbr;
}
