package com.whut.jifeixitong.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.whut.jifeixitong.entities.ShipAndApplyAndContent;
import com.whut.jifeixitong.entities.TugApplyInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PiaoJuMapper extends BaseMapper<ShipAndApplyAndContent> {
    @Select("select * from agentshipinfo s join tugapplymsginfo i on s.zhname = i.chinesename COLLATE utf8mb4_0900_ai_ci " +
            "join tugapplyopecontent c on c.tugapplyid = i.tugapplyid COLLATE utf8mb4_0900_ai_ci " +
            "${ew.customSqlSegment}")
    List<ShipAndApplyAndContent> getPiaoJu(@Param(Constants.WRAPPER) QueryWrapper<ShipAndApplyAndContent> params);
}
