package com.whut.jifeixitong.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.models.auth.In;
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
}
