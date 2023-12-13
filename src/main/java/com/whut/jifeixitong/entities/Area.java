package com.whut.jifeixitong.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("AreaInfo")
public class Area {
    private String Areaname;
    private Integer num;
}
