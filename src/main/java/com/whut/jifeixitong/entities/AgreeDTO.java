package com.whut.jifeixitong.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgreeDTO {
    private String tugapplyid;
    private Integer isagree;
    private String resmsg;
}
