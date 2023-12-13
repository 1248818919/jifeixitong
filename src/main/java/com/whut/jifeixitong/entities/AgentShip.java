package com.whut.jifeixitong.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("agentshipinfo")
public class AgentShip {
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
