package com.whut.jifeixitong.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whut.jifeixitong.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRegisterMapper extends BaseMapper<User> {
}