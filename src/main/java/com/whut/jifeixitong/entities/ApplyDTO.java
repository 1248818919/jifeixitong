package com.whut.jifeixitong.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplyDTO {
    private String zhname;
    private String sttime;
    private String edtime;
    private Integer[] operation_mkey;
    private String areaname;
    private Integer busstate;
    private Integer[] operation_num;
    private String applicant;
    private String shiptel;
}
