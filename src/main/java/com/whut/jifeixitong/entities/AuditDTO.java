package com.whut.jifeixitong.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditDTO {
    private String applyid;
    private Map<String, Double>[] aa;
    private String audit_clerk;
}
