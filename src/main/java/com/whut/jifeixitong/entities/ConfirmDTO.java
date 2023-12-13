package com.whut.jifeixitong.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfirmDTO {
    private String applyid;
    private Integer conf;
    private String checker;
    private String confirmRemark;
}
